package edu.eryx.luciel.lopez.arana.reto4.ui;
import edu.eryx.luciel.lopez.arana.reto4.process.InformeDeVentas;
import java.util.ArrayList;

/**
 * Manda a llamar a los métodos en InformesDeVentas
 * Se almacenan los valores de la tabla e imprime la relación que tiene con los métodos mencionados
 *
 * @author eryxl
 */
public class CLI {
    /**
     * Array de valores
     */
    static double[][] tablaDeVentas = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

    /**
     * Se establecen los arreglos de sabores y de trimestres para ser susituidos por su posición en la tabla.
     * Imprime todos los valores
     */
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
