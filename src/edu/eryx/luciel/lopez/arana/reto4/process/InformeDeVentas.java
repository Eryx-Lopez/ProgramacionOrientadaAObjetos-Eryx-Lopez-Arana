package edu.eryx.luciel.lopez.arana.reto4.process;
import java.util.ArrayList;

/**
 * Genera dos métodos que obtienen el producto que más se vende por sabor y por trimestre general en ventas
 *
 * @author eryxl
 */
public class InformeDeVentas {
    /**
     *Lee los valores de una tabla y regresa el valor máximo de cada fila en un array
     * @param tabla la tabla que se va a leer
     * @return los valores máximos
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

    /**
     * Suma los valores en el arreglo y devuelve la posición y valor del más grande.
     * @param tabla la tabla que se va a leer
     * @return auxIndex que es la posición de la suma más grande de cada trimestre,
     * el valor más grande de verntas generales
     */
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