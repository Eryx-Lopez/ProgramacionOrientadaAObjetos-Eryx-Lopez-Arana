package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

import java.util.Random;

public class OptionMenus {
    public static Menu menuGoToForest = new Menu();
        static String cortarMadera = "Cortar un árbol";
        public static MenuAction cortarAction = (scanner) -> {
            int arboles = 0;
            int maderaTotal = 0;
            do{
                Random random = new Random();
                int madera = (random.nextInt(5)); //Ver cómo hacer para que no imprima el 0
                //int hojasDeVida = (random.nextInt(4)); //Cómo imprimir entre dos rangos

                System.out.println("[CORTANDO ÁRBOLES...]");
                arboles++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("    Se han añadido " + madera + " piezas de madera a tu inventario.");
                System.out.println();
                maderaTotal += madera;
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }while(arboles < 3);

            System.out.println("¡Muy bien! Ahora tienes " + maderaTotal + " piezas de madera en tu inventario.");

        };
        static String yaMeArrepenti = "Sabes qué.. creo que es mejor que continúe con mi camino";
        public static MenuAction yaMearrepentiAction = (scanner) -> System.out.println("kshgsjkhgskgs");

    public static Menu menuAtacarOgro = new Menu();
        static String atacarOption = "Atacar";
        static String defenderOption = "Defender";
        public static MenuAction atacarAction = (scanner) -> {


        };



}
