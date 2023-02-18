package edu.eryx.luciel.lopez.arana.reto4.process;

import java.util.ArrayList;

public class InformeDeVentas {
    public static ArrayList<Integer> getMaxProductFromTrimester(double[][] tabla) {

        ArrayList<Integer> maximos = new ArrayList<>();

        for (int i = 0; i < tabla.length; i++) { //i representa las filas y j las columnas
            double max = Double.MIN_VALUE; //El valor más pequeño existente (-infinito)
            int auxIndex = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > max) {
                    auxIndex = j;
                    max = tabla[i][j];
                }

            }
            maximos.add(auxIndex);
        }

        return maximos;
    }

    public static int maxTrimester(double[][] tabla){
        int maxTrimester = 0;

        int auxIndex = 0;

        for (int i = 0; i < tabla.length; i++){
            int sumaDeVentas = 0;
            for (int j = 0; j < tabla.length; j++) {
                sumaDeVentas += tabla[j][i];
            }
            if (sumaDeVentas > maxTrimester) {
                maxTrimester = sumaDeVentas;
               auxIndex = i;
            }
        }
        return auxIndex;
    }

}