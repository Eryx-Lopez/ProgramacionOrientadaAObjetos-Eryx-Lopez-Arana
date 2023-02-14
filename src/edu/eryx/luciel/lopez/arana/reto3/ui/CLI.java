/**
 * Esta clase muestra las opciones para luego mandar a llamar las funciones en la clase ConversorNumerico
 */
package edu.eryx.luciel.lopez.arana.reto3.ui;
import edu.eryx.luciel.lopez.arana.reto3.process.ConversorNumerico;
import java.util.Scanner;

public class CLI {
    /**
     * Muestra y ejecuta el menú
     */
    public static void showMenu()
    {
       Scanner scanner = new Scanner(System.in);
        int salir = 0;

        salida:
        do {
            System.out.println("1. Convertir de decimal a binario\n" +
                    "2. Convertir de decimal a octal\n" +
                    "3. Convertir de decimal a hexadecimal\n" +
                    "4. Convertir de binario a decimal\n" +
                    "5. Convertir de octal a decimal\n" +
                    "6. Convertir de hexadecimal a decimal\n" +
                    "7. SALIR");

            Scanner eleccion = new Scanner(System.in);
            int eleccionDeConversion = eleccion.nextInt();

            if (eleccionDeConversion == 7) {
                System.out.println("Gracias por usar la calculadora. Saliendo...");
                break salida;
            }

            switch (eleccionDeConversion) {
                case 1:
                    System.out.println("Ingrese el digito(s)");
                    String numero = scanner.next();
                    System.out.println("La conversión es " + ConversorNumerico.convertirDeDecimalABinario(numero));
                    break;
                case 2:
                    System.out.println("Ingrese el digito(s)");
                    int numeroInt = scanner.nextInt();
                    System.out.println("La conversión es " + ConversorNumerico.convertirDeDecimalAOctal(numeroInt));
                    break;
                case 3:
                    System.out.println("Ingrese el digito(s)");
                    numeroInt = scanner.nextInt();
                    System.out.println("La conversión es " + ConversorNumerico.convertirDeDecimalAHexadecimal(numeroInt));
                    break;
                case 4:
                    System.out.println("Ingrese el digito(s)");
                    numero = scanner.next();
                    System.out.println("La conversión es " + ConversorNumerico.convertirDeBinarioADecimal(numero));
                    break;
                case 5:
                    System.out.println("Ingrese el digito(s)");
                    numero = scanner.next();
                    System.out.println("La conversión es " + ConversorNumerico.convertirDeOctalADecimal(numero));
                    break;
                case 6:
                    System.out.println("Ingrese el digito(s)");
                    numero = scanner.next();
                    System.out.println("La conversión es " + ConversorNumerico.convertirDeHexadecimalADecimal(numero));
                    break;
                case 7:
                    salir++;
                    break;
            }
        }
        while (salir == 0);
    }
}
