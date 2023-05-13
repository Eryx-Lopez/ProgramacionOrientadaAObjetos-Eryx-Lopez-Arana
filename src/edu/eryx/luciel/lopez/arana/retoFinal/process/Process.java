package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.retoFinal.process.clases.Jugador;
import edu.eryx.luciel.lopez.arana.retoFinal.process.clases.Ogro;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuAldea;
import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuPeleaOgro;

public class Process {
    public static Jugador jugador = new Jugador(30, 10, false);
    public static Ogro ogro = new Ogro(50, 8, false);
    public static int hadasRescatadas = 0;

    public static void goToForest() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Muy bien, sé que la espada puede tener muchos usos, pero déjame darte\n" +
                "esta hacha, facilitará mucho tu trabajo.\n" +
                "       (De otro color) REY HADA TE HA DADO UNA HACHA.");
        // menuGoToForest.addOption(cortarMadera, cortarAction);
        //menuGoToForest.addOption(yaMeArrepenti, yaMearrepentiAction);// El chiste sí es salirte, pero en realidad
        //Te mandaría al método que sería el final si abandonas el juego.

    }

    public static void cortarAction() {
        int arboles = 0;
        int maderaTotal = 0;
        int hojas = 0;
        int hojasTotal = 0;

        do {
            int madera = (int) (Math.random() * 5) + 1;

            hojas = (int) (Math.random() * 20) + 1;//Cómo imprimir entre dos rangos

            System.out.println("[CORTANDO ÁRBOLES...]");
            arboles++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("    Se han añadido " + madera + " piezas de madera a tu inventario.");
            System.out.println("    Se han añadido " + hojas + " hojas a tu inventario.");


            System.out.println();
            hojasTotal += hojas;
            maderaTotal += madera;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } while (arboles < 3);

        System.out.println("¡Muy bien! Ahora tienes " + maderaTotal + " piezas de madera en tu inventario.");
        System.out.println("¡Muy bien! Ahora tienes " + hojasTotal + " hojas en tu inventario.");
        System.out.println();

    }


    public static void atacarAlOgroAction() {
        jugador.toString();
        ogro.toString();
        jugador.setDefensaActiva(false);
        iniciarTurnoOgro();
    }

    public static void defenderDelOgroAction() {
        jugador.toString();
        ogro.toString();
        jugador.setDefensaActiva(true);
        iniciarTurnoOgro();
    }

    public static void pelearOgrovsHeroe() {
        System.out.println();
        System.out.println(jugador.toString());
        System.out.println(ogro.toString());
        System.out.println();

        menuPeleaOgro.showMenu();
        var atacar = menuPeleaOgro.readOption();
        menuPeleaOgro.selectAndRunOption(atacar);
    }

    public static void iniciarTurnoOgro() {
        int decisionDelOgro = (int) (Math.random() * 2) + 1;
        //1 ataca
        //2 defiende

        if (decisionDelOgro == 1) { //ATAQUE DEL OGRO
            System.out.println("¡Prepárate, el ogro te ataca!");
            System.out.println(jugador.toString());
            System.out.println(ogro.toString());

            if (jugador.isDefensaActiva() == true) { //JUGADOR DEFIENDE
                jugador.setVida(jugador.getVida() - (ogro.getPoderDeAtaque() / 3));
                jugador.setDefensaActiva(false);
                decisionDelOgro = 0;
                decidirGanador();

            } else { //JUGADOR ATACA
                ogro.setVida(ogro.getVida() - jugador.getPoderDeAtaque());
                jugador.setVida((int) jugador.getVida() - ogro.getPoderDeAtaque());
                decisionDelOgro = 0;
                decidirGanador();
            }
        }

        if (decisionDelOgro == 2) { //DEFENSA DEL OGRO
            System.out.println("¡El ogro se defendió, ten cuidado!");
            System.out.println(jugador.toString());
            System.out.println(ogro.toString());
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


    }

    public static void decidirGanador() {

        if (ogro.getVida() <= 0){
            jugador.resetVida(50);
            System.out.println(jugador.toString());
            System.out.println(ogro.toString());
            System.out.println("¡Bien hecho! Lograste derrotar al ogro.");

            Calculadoras.ogrosMuertos++;
            hadasRescatadas = (int) (Math.random() * 7) + 1;
            System.out.println("Has rescatado " + hadasRescatadas + " hadas.");
            jugador.setPoderDeAtaque(+ Calculadoras.ogrosMuertos);
            System.out.println("Regresemos a la aldea, es peligroso estar fuera por tanto tiempo.\n" +
                    "Además necesitamos curarte un poco.");
        }


        if (jugador.getVida() <= 0 ){
            System.out.println();
            System.out.println(jugador.toString());
            System.out.println(ogro.toString());
            Finales.finalSiAbandonas();
        }
        while (jugador.getVida() > 0 && ogro.getVida() > 0){
            pelearOgrovsHeroe();
        }

    }
    public static void irALaAldea(){

        System.out.println("Bienvenido a la aldea. Aquí es donde puedes descansar un poco\n" +
                "y curarte de las heridas hechas durante tus peleas. ¿Recuerdas las hojas que\n" +
                "te dieron cada que cortabas un árbol?\n" +
                "Bueno, esas las puedes usar para comprar items dentro de la aldea. Vamos");


    }
}

