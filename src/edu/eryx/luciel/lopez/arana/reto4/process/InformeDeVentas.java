package edu.eryx.luciel.lopez.arana.reto4.process;

import java.util.ArrayList;
import java.util.List;

public class InformeDeVentas {
    double [][] tablaDeVentas= {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

    /**
     *
     * @param tabla
     * @return el valor más grande de la
     */
    public static double getMaxProductFromTrimester(double[][] tabla){
        double max = Double.MAX_VALUE; //El valor más pequeño existente (-infinito)
       // int auxIndex = 0;

        for (int i = 0; i < tabla[0].length; i++){ //i representa las filas y j las columnas
            for (int j = 0; j < tabla.length; j++){
                if  ( tabla[i][j]>max){
                    max = tabla[i][j];
                }
            }
        }
        return max;
        ayuda no sé que estoy haciendo
    }
}
