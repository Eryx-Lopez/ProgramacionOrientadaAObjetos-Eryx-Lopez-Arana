package edu.eryx.luciel.lopez.arana.reto1.ui;

import edu.eryx.luciel.lopez.arana.reto1.process.Calculadora;
import java.util.Scanner;
public class CLI {
    public static void mostrarMenu(){
        int resultado = -1;
        char operacion = ' ';

        Scanner opcion = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora. \nPor favor seleccione una opción \n" +
                "1.- Sumar \n2.- Restar \n3.- Multiplicar \n4.- Dividir");
        int opcionElegida = opcion.nextInt(); opcion.nextLine();

        while (opcionElegida > 4 || opcionElegida < 1){
            System.out.println("Por favor ingresa una opción válida");
            System.out.println("\n1.- Sumar \n2.- Restar \n3.- Multiplicar \n4.- Dividir");
            opcionElegida = opcion.nextInt();
        }

        System.out.println("Introduzca el primer dígito: ");
        int numero1 = opcion.nextInt(); opcion.nextLine();

        System.out.println("Introduzca el segundo dígito: ");
        int numero2 = opcion.nextInt(); opcion.nextLine();



        switch (opcionElegida){
            case 1:
                resultado = Calculadora.sumarEnteros(numero1, numero2);
                operacion = '+';
                break;
            case 2:
                resultado = Calculadora.restarEnteros(numero1, numero2);
                operacion = '-';
                break;
            case 3:
                resultado = Calculadora.multiplicarEnteros(numero1, numero2);
                operacion = '*';
                break;
            case 4:
                resultado = Calculadora.divisionEnteros(numero1, numero2);
                operacion = '/';
                break;
            default:
                System.out.println("Por favor ingrese un número válido.");
        }
        System.out.printf("Su operación y resultado son: \n %d %c %d = %d", numero1, operacion, numero2, resultado);
        System.out.println("\n Gracias por usar nuestra calculadora.");

    }
}
