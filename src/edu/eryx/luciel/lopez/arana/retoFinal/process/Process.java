package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.retoFinal.process.clases.Jugador;
import edu.eryx.luciel.lopez.arana.retoFinal.process.clases.Ogro;
import edu.eryx.luciel.lopez.arana.retoFinal.ui.CLI;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.*;
import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuAldea;

public class Process {
    private static boolean indicadorPelea = false;

    public static Jugador jugador = new Jugador(30, 10, false);
    public static Ogro ogro = new Ogro(50, 8, false);

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
            Process.pelearOgrovsHeroe();
            indicadorPelea = true;
        }
    }



    public static void cortarAction() {
        int arboles = 0;

        do {
            jugador.setMadera((int) (Math.random() * 5) + 1);

            jugador.setHojas((int) (Math.random() * 20) + 1);

            System.out.println("[CORTANDO ÁRBOLES...]");
            arboles++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("    Se han añadido " + jugador.getMadera() + " piezas de madera a tu inventario.");
            System.out.println("    Se han añadido " + jugador.getHojas() + " hojas a tu inventario.");


            System.out.println();
            jugador.setHojasTotal(+jugador.getHojas());
            jugador.setMaderaTotal(+ jugador.getMadera());
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

    public static void pelearOgrovsHeroe() {
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

    public static void atacarAlOgroAction() {
        System.out.println("¡Atacas con tu espada al ogro!");
        jugador.setDefensaActiva(false);
        iniciarTurnoOgro();
    } //No le muevas

    public static void defenderDelOgroAction() {
        System.out.println("¡Bloqueas un ataque del ogro con tu espada!");
        jugador.setDefensaActiva(true);
        iniciarTurnoOgro();
    } //No le muevas


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

    public static void decidirGanador() {

    if (ogro.getVida() <= 0){
        System.out.println("Espera... ¡Bien hecho! ¡Lograste derrotar al ogro!");
        Calculadoras.ogrosMuertos++;
        jugador.setPoderDeAtaque(+ Calculadoras.ogrosMuertos);

        jugador.hadasRescatadas = (int) (Math.random() * 7) + 1;
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
        pelearOgrovsHeroe();
    }

    } //Ya no le muevas

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
    public static void pieDeManzanaAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int pieManzanaCosto = 15;
        jugador.setHojasTotal(jugador.getHojasTotal() - pieManzanaCosto);
        jugador.setVida(jugador.getVida() + (jugador.getVida()/2));
        if(jugador.getVida() > 30){
            jugador.setVida(30);
        }
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());


    }
    public static void pastelDeLavandaAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int pastelLavandaCosto = 40;
        jugador.setHojasTotal(jugador.getHojasTotal() - pastelLavandaCosto);
        jugador.setVida(30);
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());



    }
    public static void tortuConchasAction(){
        System.out.println("Hojas: " + jugador.hojasTotal);
        int tortuConchasCosto = 70;
        jugador.setHojasTotal(jugador.getHojasTotal() - tortuConchasCosto);
        jugador.setVida(30 + 5);
        System.out.println("Hojas: " + jugador.getHojasTotal());
        System.out.println("Vida: "+ jugador.getVida());

    }
    public static void irALaAldea(){
        boolean indicadorAldea = false;

        jugador.setPoderDeAtaque(10 + Calculadoras.multiplicadorDePoder);

        if (indicadorAldea == false){
            System.out.println("Bienvenido a la aldea. Aquí puedes descansar un poco y curarte de las\n" +
                    "heridas hechas durante tus peleas. ¿Recuerdas las hojas que obtuviste al cortar\n" +
                    "los árboles? Bueno, esas las puedes usar para comprar items dentro de la aldea. Vamos, vamos.");
            System.out.println();
        }

        System.out.println("[EL REY HADA TE LLEVA A LA PANADERÍA]");
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

            System.out.println("Hojas: " + jugador.getHojasTotal());
            System.out.println("Vida: "+ jugador.getVida());
            System.out.println("¡Ya no tienes hojas suficientes! Si quieres seguir comprando items, necesitas más hojas.\n" +
                    "Y bueno.. ya tienes las bases, ahora toma tus decisiones.");



            if (indicadorAldea == false){
                System.out.println("...\n" +
                        "¡Casi olvido lo más importante! No puede ser, qué tonto...");
                System.out.println("Rescatar hadas. Hay que rescatar a mis hadas. No sólo las hojas son importantes\n" +
                        "la madera también lo es.\n" +
                        "Por cada 4 trozos de madera, puedes hacer una casa para hadas. En cada casa caben 5 hadas.\n" +
                        "Y ahora sí, ¡Eso ya es todo! Ya deberías de ser capaz de moverte por tu cuenta.\n" +
                        "Cuídate, pequeño héroe.");
                indicadorAldea = true;
            }

            menuAldea.showMenu();
            var aldea = menuAldea.readOption();
            menuAldea.selectAndRunOption(aldea);
        }



    public static void encontrarOgroAction(){
        System.out.println(CLI.OGRO_ENCONTRADO);
        Process.pelearOgrovsHeroe();
    }

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
            System.out.println("Tienes suficiente madera, hagamos unas casas");

        }
    }
}


