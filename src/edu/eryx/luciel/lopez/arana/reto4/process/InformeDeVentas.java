package edu.eryx.luciel.lopez.arana.reto4.process;

public class InformeDeVentas {
    double[][] tablaDeVentas = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

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

    public static double getMaxProductFromTrimester(double[][] tabla) {
        double max = Double.MIN_VALUE; //El valor más pequeño existente (-infinito)
        // int auxIndex = 0;

        for (int i = 0; i < tabla[0].length; i++) { //i representa las filas y j las columnas
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                }

            }
        }
        return max;
    }

}