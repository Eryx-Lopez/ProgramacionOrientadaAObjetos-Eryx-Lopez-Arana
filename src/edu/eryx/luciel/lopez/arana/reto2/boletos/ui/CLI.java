/**
 * Interfaz con el usuario para informar el tipo de boletos que hay y el precio que éstos tienen.
 * @param numAdulto número de boletos de Adulto
 * @param numMenorYMayor número de boletos de niño o de adulto mayor sin credencial, ya que éstos cuestan
 *                       lo mismo
 * @param numAdultoMayor número de boletos de adulto mayor con credencial del INAPAM
 * @param cuentaFinal variable hecha para salir del while al momento de pedir la cuenta final
 * @param tipoDeBoleto para el switch case, separar el tipo de boleto
 *
 * */
package edu.eryx.luciel.lopez.arana.reto2.boletos.ui;
import edu.eryx.luciel.lopez.arana.reto2.boletos.process.Boletos;
import java.util.Scanner;


public class CLI {
    public static void  showMenu(){
        int numAdulto = 0;
        int numMenorYMayor = 0;
        int numAdultoMayor = 0;
        int cuentaFinal = 0;

        System.out.println("Bienvenido/a \n");
        salida:
        do {
            System.out.println("Elija el número del boleto que deseee comprar \n"+
                    "1. Boleto de adulto: $100\n" +
                    "2. Boleto de niño o adulto mayor sin credencial: $70\n" +
                    "3. Boleto de adulto mayor (INAPAM): $50\n" +
                    "4. Cuenta final.\n" +
                    "5. CANCELAR COMPRA");

            Scanner boletos = new Scanner(System.in);
            int tipoDeBoleto = boletos.nextInt();

            if (tipoDeBoleto == 5){
                System.out.println("Su compra ha sido cancelada, gracias por su tiempo, tenga un buen día.");
                break salida;
            }
            switch (tipoDeBoleto){
                case 1:
                    numAdulto++;
                    break;
                case 2:
                    numMenorYMayor++;
                    break;
                case 3:
                    numAdultoMayor++;
                    break;
                case 4:
                    cuentaFinal++;

            }
        }
        while (cuentaFinal == 0);


        System.out.println("Su cuenta final es: $"+Boletos.calcularCosto(numAdulto,numMenorYMayor,numAdultoMayor));
    }
}
//https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/