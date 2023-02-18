package edu.eryx.luciel.lopez.arana.reto4.ui;

import edu.eryx.luciel.lopez.arana.reto4.process.InformeDeVentas;

import java.util.ArrayList;

public class CLI {
    static double[][] tablaDeVentas = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };


    public static void showTabla(){
      String[] flavours = {"Chocolate", "Vanilla", "Fresa", "Oreo"};
      String[] trimestres = {"Enero a Marzo", "Abril a Junio", "Julio a Septiembre","Octubre a Diciembre"};
      for (int i = 0; i< flavours.length; i++){
        ArrayList<Integer> maximos = InformeDeVentas.getMaxProductFromTrimester(tablaDeVentas);
          System.out.println("El mejor trimestre para " + flavours[i] + " es: " + trimestres[maximos.get(i)]);
      }
        System.out.println();
        System.out.println("El mejor trimestre en ventas generales es: "+ trimestres[InformeDeVentas.maxTrimester(tablaDeVentas)]);
    }
}
