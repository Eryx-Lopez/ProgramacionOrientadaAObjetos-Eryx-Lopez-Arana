package edu.eryx.luciel.lopez.arana.reto2.boletos.process;


public class Boletos{


        public static double precioAdulto = 100;
        public static double precioMenorYMayor = 70;

        public static double precioINAPAM = 50;


        int boletoNiñoYMayor = 70;
        int boletoINAPAM = 50;

        System.out.println("Hola, bienvenido/a \nIngrese el tipo de boleto: ");
        char boleto = tipoDeBoleto.next().charAt(0);


        if (boleto == 'A' || boleto =='a'){
            System.out.printf("Tiene un costo de $%d", boletoAdulto);

        }

    }

    //https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
