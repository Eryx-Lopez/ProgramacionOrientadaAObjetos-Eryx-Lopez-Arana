package edu.eryx.luciel.lopez.arana.reto9.Parte1;

import java.util.Scanner;

public class Pelota {
    static String color = "Amarilla";
    static int rapidez = 15;
    static int poder = 20;

    public static void disminuirRapidez(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("El valor default de la rapidez es de " + rapidez + "\n" + "Ingrese cuánto desea desiminuir la rapidez");
        int menosRapidez = scanner.nextInt();
        int rapidezFinal = (rapidez - menosRapidez);
        System.out.println("Ahora la rapidez es de: " + rapidezFinal);
    }

    public static void aumentarPoder(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("El valor default del poder es de " + poder + "\n" + "Ingrese cuánto desea aumentar el poder");
        int masPoder = scanner.nextInt();
        int poderFinal = (poder + masPoder);
        System.out.println("Ahora el poder es de: " + poderFinal);
    }
    public static void main(String[] args) {
         disminuirRapidez();
        System.out.println("---------------");
         aumentarPoder();
    }

}
