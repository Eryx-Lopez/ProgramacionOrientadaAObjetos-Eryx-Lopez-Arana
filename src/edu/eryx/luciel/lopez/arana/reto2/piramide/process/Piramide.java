package edu.eryx.luciel.lopez.arana.reto2.piramide.process;

import java.util.Scanner;

public class Piramide {
    /**
     * Clase para pedir e imprimir el número de asteriscos que se da por el usuario
     * @param
     * @author eryxl
     * */

    public static void main(String[] args) {

    }


    public static void imprimirAsteriscos(){
        Scanner asteriscos = new Scanner(System.in);
        int numAsteriscos = asteriscos.nextInt();

        for (int i=0; i<numAsteriscos; i++){ //número de filas de asteriscos
            for (int j=1; j<numAsteriscos-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
