package edu.eryx.luciel.lopez.arana.retoFinal.process;
import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

import java.util.Random;

public class Process {
    public static Menu menuGoToForest = new Menu();
    static String cortarMadera = "Cortar madera";
    static String atacarOgro = "Atacar Ogro";
    public static MenuAction cortarAction = (scanner) -> {
        int maderaTotal = 0;
        int hojasDeVidaTotal = 0;
        int arboles = 0;

        do{
            Random random = new Random();
            int madera = (random.nextInt(5)); //Ver cómo hacer para que no imprima el 0
            int hojasDeVida = (random.nextInt(4)); //Cómo imprimir entre dos rangos
            arboles++;
            System.out.println();
            System.out.println("Árbol número " + arboles + ".");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Has recolectado " + madera + " piezas de madera.\n" +
                    "   Con 4 piezas de madera puedes hacer una casa para las hadas.");
            System.out.println();
            System.out.println("Has recolectado " + hojasDeVida + " hojas de vida.\n" +
                    "   Curan un punto de vida");
            maderaTotal += madera;
            hojasDeVidaTotal += hojasDeVida;

        }while (arboles  < 3);



       // for (int i = 1; i < 4; i++) {

        //}


        System.out.println("\nLa madera recolectada fue: " + maderaTotal);
        System.out.println("\nLas hojas de vida recolectadas fueron: " + hojasDeVidaTotal);
    };
    public static MenuAction atacarAction = (scanner) -> {
        System.out.println("kshgsjkhgskgs");
    };
    public static void goToForest(){
       // menu.clearMenu();
        menuGoToForest.addOption(cortarMadera, cortarAction);
        menuGoToForest.addOption(atacarOgro, atacarAction);
    }
}
