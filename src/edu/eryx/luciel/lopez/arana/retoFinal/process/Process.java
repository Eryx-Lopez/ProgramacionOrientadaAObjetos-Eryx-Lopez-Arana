package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.retoFinal.process.clases.Jugador;
import edu.eryx.luciel.lopez.arana.retoFinal.process.clases.Ogro;
import edu.eryx.luciel.lopez.arana.retoFinal.ui.CLI;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.*;
import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuAldea;

/**
 * Aquí están todos los métodos que se usan para correr el juego
 */
public class Process {
    private static boolean indicadorPelea = false;

    public static Jugador jugador = new Jugador(30, 10, false);
    public static Ogro ogro = new Ogro(50, 8, false);

    /**
     * Lanza el menú que se usa al llegar al bosque y da una introducción que sólo sale la primera vez
     * que llegas bosque.
     */
    public static void goToForest(){

        menuGoToForest.showMenu();
        var forest = menuGoToForest.readOption();
        menuGoToForest.selectAndRunOption(forest);


        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(indicadorPelea == false) {
            System.out.println(CLI.A_LUCHAR);
            System.out.println();
            Process.iniciarPeleaOgrovsHeroe();
            indicadorPelea = true;
        }
    }

    /**
     * Genera la madera y las hojas que se necesitan dentro del juego, de forma aleatoria
     */
    public static void cortarAction() {
        int arboles = 0;

        do {
            jugador.madera = ((int) (Math.random() * 5) + 1);
            jugador.hojas = ((int) (Math.random() * 20) + 1);

            System.out.println("[CORTANDO ARBOLES...]");
            arboles++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("    Se han añadido " + jugador.madera + " piezas de madera a tu inventario.");
            System.out.println("    Se han añadido " + jugador.hojas + " hojas a tu inventario.");


            System.out.println();
            jugador.maderaTotal += jugador.madera;
            jugador.hojasTotal += jugador.hojas;

            jugador.setMaderaTotal(jugador.maderaTotal);
            jugador.setHojasTotal(jugador.hojasTotal);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } while (arboles < 3);

        System.out.println("¡Muy bien! Ahora tienes " + jugador.getMaderaTotal() + " piezas de madera en tu inventario.");
        System.out.println("¡Muy bien! Ahora tienes " + jugador.getHojasTotal() + " hojas en tu inventario.");
        System.out.println();

    } //No le muevas

    /**
     * Inicia la pelea del ogro contra el jugador, lanzando el menú de ataque y defensa
     */
    public static void iniciarPeleaOgrovsHeroe() {
        if (ogro.indicadorOgro == false){
            ogro.setVida(50);
            ogro.indicadorOgro = true;
        }
        System.out.println();
        System.out.println(jugador.toString());
        System.out.println(ogro.toString());
        System.out.println();

        menuPeleaOgro.showMenu();
        var atacar = menuPeleaOgro.readOption();
        menuPeleaOgro.selectAndRunOption(atacar);
    } //esto está bien, no le muevas

    /**
     * Ataca al ogro y luego pasamos a su turno
     */
    public static void atacarAlOgroAction() {
        System.out.println("¡Atacas con tu espada al ogro!");
        jugador.setDefensaActiva(false);
        iniciarTurnoOgro();
    } //No le muevas

    /**
     * Se defiende del ogro y pasamos a su turno
     */
    public static void defenderDelOgroAction() {
        System.out.println("¡Bloqueas un ataque del ogro con tu espada!");
        jugador.setDefensaActiva(true);
        iniciarTurnoOgro();
    } //No le muevas

    /**
     * Es el turno del ogro, por lo que se consideran las acciones al momento de que la defensa, tanto
     * del jugador como del ogro, estén activas, como si no.
     */
    public static void iniciarTurnoOgro() {
        int decisionDelOgro = (int) (Math.random() * 2) + 1;
        //1 ataca
        //2 defiende

        if (decisionDelOgro == 1) { //ATAQUE DEL OGRO
            System.out.println("¡Prepárate, el ogro te ataca!");

            if (jugador.isDefensaActiva() == true) { //JUGADOR DEFIENDE
                jugador.setVida(jugador.getVida() - (ogro.getPoderDeAtaque() / 2));
                jugador.setDefensaActiva(false);
                decisionDelOgro = 0;
                decidirGanador();

            } else { //JUGADOR ATACA
                ogro.setVida(ogro.getVida() - jugador.getPoderDeAtaque());
                jugador.setVida(jugador.getVida() - ogro.getPoderDeAtaque());
                decisionDelOgro = 0;
                decidirGanador(); //
            }
        }

        if (decisionDelOgro == 2) { //DEFENSA DEL OGRO
            System.out.println("¡El ogro se defendió, ten cuidado!");
            if (jugador.isDefensaActiva() == true) { //JUGADOR DEFIENDE
                decisionDelOgro = 0;
                jugador.setDefensaActiva(false);
                decidirGanador();
            } else { //JUGADOR ATACA
                ogro.setVida(ogro.getVida() - (jugador.getPoderDeAtaque() / 2));
                decisionDelOgro = 0;
                decidirGanador();
            }
        }


    } //No le muevas

    /**
     * Hace una revisión de la vida para saber si volver a lanzar el menú de pelea, dar salida al juego, o
     * continuar a la aldea.
     */
    public static void decidirGanador() {

    if (ogro.getVida() <= 0){
        System.out.println("Espera... ¡Bien hecho! ¡Lograste derrotar al ogro!");
        jugador.setOgrosMuertos(+1);
        jugador.setPoderDeAtaque(+ Calculadoras.multiplicadorDePoderOgro);

        jugador.hadasRescatadas = (int) (Math.random() * 15) + 1;
        System.out.println("Has rescatado " + jugador.hadasRescatadas + " hadas.");
        System.out.println();
        System.out.println("Regresemos a la aldea, es peligroso estar fuera por tanto tiempo.\n" +
                "Además necesitamos curarte un poco.");
        System.out.println();
        System.out.println("[REGRESANDO A LA ALDEA]");
        System.out.println("Vida: "+ jugador.getVida());

        System.out.println();
        irALaAldea();
    }
    if (jugador.getVida() <= 0){
        Finales.finalSiAbandonas();
    }
    while (jugador.getVida() > 0 && ogro.getVida() >0){
        iniciarPeleaOgrovsHeroe();
    }

    } //Ya no le muevas

    /**
     * Lo que sucede cuando te comes un pie de mora azul, tu vida aumenta 3 puntos
     */
    public static void pieMoraAzulAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int pieMoraAzulCosto = 8;
        jugador.setHojasTotal(jugador.getHojasTotal() - pieMoraAzulCosto);
        jugador.setVida(jugador.getVida()+3);
        if(jugador.getVida() > 30){
            jugador.setVida(30);
        }
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());


    }
    /**
     * Lo que sucede cuando te comes un pie de manzana, tu vida aumenta a la mitad
     */
    public static void pieDeManzanaAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int pieManzanaCosto = 15;
        jugador.setHojasTotal(jugador.getHojasTotal() - pieManzanaCosto);
        jugador.setVida(jugador.getVida() + (30/2));
        if(jugador.getVida() > 30){
            jugador.setVida(30);
        }
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());
    }

    /**
     * Lo que sucede cuando te comes un pastel de lavanda, tu vida aumenta al máximo
     */
    public static void pastelDeLavandaAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int pastelLavandaCosto = 40;
        jugador.setHojasTotal(jugador.getHojasTotal() - pastelLavandaCosto);
        jugador.setVida(30);
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());



    }
    /**
     * Lo que sucede cuando te comes un pie de mora azul, tu vida aumenta al máximo y te agrega 5 puntos extras
     */
    public static void tortuConchasAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int tortuConchasCosto = 70;
        jugador.setHojasTotal(jugador.getHojasTotal() - tortuConchasCosto);
        jugador.setVida(30 + 5);
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());

    }

    /**
     * Primero muestra una introducción que solo aparece la primera vez que llegas a la aldea.
     * Luego despliega el menu de los items disponibles, solo mientras tengas las hojas necesarias.
     * De ahi pasamos al menu en donde decides si construir o seguir cortando arboles.
     */
    public static void irALaAldea(){
        boolean indicadorAldea = false;
        ogro.setVida(50);
        jugador.setPoderDeAtaque(10 + Calculadoras.multiplicadorDePoderOgro);

        if (indicadorAldea == false){
            System.out.println("Bienvenido a la aldea. Aquí puedes descansar un poco y curarte de las\n" +
                    "heridas hechas durante tus peleas. ¿Recuerdas las hojas que obtuviste al cortar\n" +
                    "los árboles? Bueno, esas las puedes usar para comprar items dentro de la aldea. Vamos, vamos.");
            System.out.println();
        }

        System.out.println("[EL REY HADA TE LLEVA A LA PANADERIA]");
        System.out.println();
        System.out.println("¡Panes! ¿A quién no le gusta un buen pan?\n" +
                "Hay diferentes tipos de panes, mira... ");
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());


        while (jugador.hojasTotal > 8){
            menuItems.showMenu();
            var items = menuItems.readOption();
            menuItems.selectAndRunOption(items);
        }
        if(jugador.getVida() >= 30 && jugador.hojasTotal < 60 ){
            System.out.println("¡Tienes la vida completa! Ya puedes continuar con tu aventura..");
            if (indicadorAldea == false){
                System.out.println(CLI.CONSTRUIR_CASAS);
                indicadorAldea = true;
            }
            menuAldea.showMenu();
            var aldea = menuAldea.readOption();
            menuAldea.selectAndRunOption(aldea);
        }

        System.out.println("Hojas: " + jugador.getHojasTotal());
            System.out.println("Vida: "+ jugador.getVida());
            System.out.println("¡Ya no tienes hojas suficientes! Si quieres seguir comprando items, necesitas más hojas.\n" +
                    "Y bueno.. ya tienes las bases, ahora toma tus decisiones.");

            if (indicadorAldea == false){
                System.out.println(CLI.CONSTRUIR_CASAS);
                indicadorAldea = true;
            }

            menuAldea.showMenu();
            var aldea = menuAldea.readOption();
            menuAldea.selectAndRunOption(aldea);
        }

    /**
     * Lanza un mensaje cuando encuentras al ogro y luego vuelve a iniciar la pelea contra el ogro
     */
    public static void encontrarOgroAction(){
        System.out.println(CLI.OGRO_ENCONTRADO);
        Process.iniciarPeleaOgrovsHeroe();
    }

    /**
     * Hace las casas para las hadas. Utiliza 4 de madera para hacer 1 casa y por cada casa, rescatas 5 hadas.
     */
    public static void hacerCasasAction(){

        System.out.println("Muy bien, recuerda, 4 maderas, 1 casa, 1 casa, 5 hadas.\n" +
                "¿Mencioné que tu poder sube también con las hadas que tienes ya en casa? En fin...");
        System.out.println("Madera: " + jugador.getMaderaTotal());
        System.out.println("Hadas sin casa: " + jugador.getHadasRescatadas());
        System.out.println("Hadas con casa: " + jugador.getHadasConCasa());

        if(jugador.getMaderaTotal() <= 4 ){
            System.out.println("Espera, aún te falta madera, regresa al bosque y luego construye");
            Process.goToForest();
        }else{
            System.out.println("Tienes suficiente madera, hagamos casas");
            jugador.setCasasConstruidas(jugador.getCasasConstruidas()+(jugador.getMaderaTotal()/4));
            jugador.setHadasRescatadas(jugador.getHadasRescatadas()-5);
            jugador.setHadasConCasa(+5);
            jugador.setMaderaTotal(jugador.getMaderaTotal()-4);
            jugador.setPoderDeAtaque(jugador.getPoderDeAtaque()+Calculadoras.multiplicadorDePoderHadas);
            if (jugador.getHadasRescatadas() <= 1){
                System.out.println("No tienes suficientes hadas para refugiar en una casa. ¡Ve y rescata más!");
            }
        }
        System.out.println("Casas construidas: "+ jugador.getCasasConstruidas());
        System.out.println("Hadas rescatadas: "+ jugador.getHadasRescatadas());
        System.out.println("Hadas con casa: " + jugador.getHadasConCasa());
        System.out.println("Madera restante: "+ jugador.getMaderaTotal());
    }
}


