package edu.eryx.luciel.lopez.arana.reto4.process;

import java.util.ArrayList;
import java.util.List;

public class InformeDeVentas {
    double [][] tabla = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

    public static double gwtMaxProductFromTrimester(double[][] tabla){
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxIndex = 0;

        for (int i = 0; i < tabla.length; i++){ //i representa las filas y j las columnas
            max = Double.MAX_VALUE; //El valor más pequeño existente (-infinito)
            for (int j = 0; j < tabla.length; j++){
                if  ( tabla[i][j]>max){
                    max = tabla[i][j];
                    auxIndex = j;
                }
            }
        }
        return auxIndex;
    }


}
