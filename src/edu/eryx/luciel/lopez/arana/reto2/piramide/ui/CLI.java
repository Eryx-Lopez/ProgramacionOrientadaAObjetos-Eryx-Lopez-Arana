/**
 * Clase para pedir el número de asterisco o filas, que serán el tamaño de la pirámide
 * @param asteriscos almacena el número de asteriscos
 * */
package edu.eryx.luciel.lopez.arana.reto2.piramide.ui;
import edu.eryx.luciel.lopez.arana.reto2.piramide.process.Piramide;
import java.util.Scanner;

public class CLI {

    public static void pedirAsteriscos(){
        System.out.println("Inserte el número del que desea su triángulo de asteriscos:");
        Scanner numAsterisco = new Scanner(System.in);
        int asteriscos = numAsterisco.nextInt();
        Piramide.imprimirAsteriscos(asteriscos);
        }
    }


