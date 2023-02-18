package edu.eryx.luciel.lopez.arana.reto4.process;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InformeDeVentas {
/*
    public static double getMaxChocolate(double[] tabla) {
        double maxChocolate = Double.MIN_VALUE; //El valor más pequeño existente (-infinito)
        for (int i = 0; i < tabla[0]; i++) { //i representa las filas y
            for (int j = 0; j < tabla.length; j++) { //j las columnas
                if (tabla[i] > maxChocolate) {
                    maxChocolate = tabla[i];
                }
            }
        }
        return maxChocolate;
    }

    public static double getMaxVainilla(double[] tabla) {
        double maxVainilla = Double.MIN_VALUE;
        for (int i = 0; i < tabla[1]; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i] > maxVainilla) {
                    maxVainilla = tabla[i];
                }
            }
        }
        return maxVainilla;
    }

    public static double getMaxFresa(double[] tabla) {
        double maxFresa = Double.MIN_VALUE;
        for (int i = 0; i < tabla[2]; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i] > maxFresa) {
                    maxFresa = tabla[i];
                }
            }
        }
        return maxFresa;
    }

    public static double getMaxOreo(double[] tabla) {
        double maxOreo = Double.MIN_VALUE;
        for (int i = 0; i < tabla[3]; i++) { //i representa las filas y
            for (int j = 0; j < tabla.length; j++) { //j las columnas
                if (tabla[i] > maxOreo) {
                    maxOreo = tabla[i];
                }
            }
        }
        return maxOreo;
    }
*/
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

}