package edu.eryx.luciel.lopez.arana.reto4.ui;

import edu.eryx.luciel.lopez.arana.reto4.process.InformeDeVentas;

public class CLI {
    static double[][] tablaDeVentas = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };


    public static void showTabla(){
      String[] trimestres = {"Enero a Marzo", "Abril a Junio", "Julio a Septiembre","Octubre a Diciembre"};
        for(int i: InformeDeVentas.getMaxProductFromTrimester(tablaDeVentas) )  {
          System.out.println("El trimestre que más vendió de  "+trimestres[i]);
      }

    }
}
