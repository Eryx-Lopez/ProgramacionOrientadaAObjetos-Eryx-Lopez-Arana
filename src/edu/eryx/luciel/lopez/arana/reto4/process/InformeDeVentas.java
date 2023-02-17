package edu.eryx.luciel.lopez.arana.reto4.process;


/**
 *
 *
 */
public class InformeDeVentas {
    double [][] tablaDeVentas = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

    /**
     *
     * @param tabla es un areglo que contiene el número de ventas según cada trimestre
     * @return el valor más grande de la
     */
    public static double getMaxProductFromTrimester(double[] tabla){
        double maxChocolate = Double.MAX_VALUE; //El valor más pequeño existente (-infinito)
        double maxVainilla = Double.MAX_VALUE;
        double maxFresa = Double.MAX_VALUE;
        double maxOreo = Double.MAX_VALUE;

        for (int i = 0; i < tabla[0]; i++){ //i representa las filas y
            for (int j = 0; j < tabla.length; j++){ //j las columnas
                if  ( tabla[i]>maxChocolate){
                    maxChocolate = tabla[i];
                }

            }
        }
        for (int i = 0; i < tabla[1]; i++){ //i representa las filas y
            for (int j = 0; j < tabla.length; j++){ //j las columnas
                if  ( tabla[i]>maxVainilla){
                    maxVainilla= tabla[i];
                }

            }
        }
        for (int i = 0; i < tabla[2]; i++){ //i representa las filas y
            for (int j = 0; j < tabla.length; j++){ //j las columnas
                if  ( tabla[i]>maxFresa){
                    maxFresa= tabla[i];
                }

            }
        }
        for (int i = 0; i < tabla[3]; i++){ //i representa las filas y
            for (int j = 0; j < tabla.length; j++){ //j las columnas
                if  ( tabla[i]>maxOreo){
                    maxOreo= tabla[i];
                }

            }
        }

        return maxOreo;
    }
}
