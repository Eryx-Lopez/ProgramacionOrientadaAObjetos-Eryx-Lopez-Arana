
/**
 * Esta clase contiene los tipos de conversiones: decimal a octal, binario o hexadecimal y viceversa
 */
package edu.eryx.luciel.lopez.arana.reto3.process;


public class ConversorNumerico {
    /**
     * Se encarga de convertir números decimales a base 2, binario
     *
     * @param numeroDecimalABinario contiene el valor de la conversión de decimal a binario
     * @return regresa el valor binario
     */
    public static String convertirDeDecimalABinario(String numeroDecimalABinario) {
        int numeroDecimal = 0;
        int residuo;
        String numeroBinario = "";


        while (numeroDecimal > 0) {
            residuo = (numeroDecimal % 2);
            numeroBinario = residuo + numeroBinario;
            numeroDecimal = (numeroDecimal / 2);
        }
        return numeroBinario;
    }

    /**
     * Se encarga de convertir números decimales a base 8, octal
     *
     * @param numeroDecimalAOctal contiene el valor de la conversión de decimal a octal
     * @return regresa el valor octal
     */
    public static String convertirDeDecimalAOctal(int numeroDecimalAOctal){
    String numeroOctal = "";
    String rangeOctal = "01234567";
        if (numeroDecimalAOctal == 0) {
             numeroOctal = "0";
        }
    while (numeroDecimalAOctal > 0) {
        int residuo = numeroDecimalAOctal % 8;
        numeroOctal = (rangeOctal.charAt(residuo) + numeroOctal);
        numeroDecimalAOctal/= 8;
    }
    return numeroOctal;
}

    /**
     * Se encarga de convertir números decimales a base 16, hexadecimal
     *
     * @param numeroDecimalAHexadecimal contiene el valor de la conversión de decimal a hexadecimal
     * @return regresa el valor hexadecimal
     */
public static String convertirDeDecimalAHexadecimal(int numeroDecimalAHexadecimal){
        String numeroHexadecimal = "";
        String rangeHexadecimal ="123456789ABCFDEF";

        if (numeroDecimalAHexadecimal == 0) {
        numeroHexadecimal = "0";
        }
        while(numeroDecimalAHexadecimal > 0){
            int residuo = numeroDecimalAHexadecimal % 16;
            numeroHexadecimal = (rangeHexadecimal.charAt(residuo) + numeroHexadecimal);
            numeroDecimalAHexadecimal/=16;
        }
        return numeroHexadecimal;
}

    /**
     * Se encarga de convertir números binarios a base 10, decimal
     *
     * @param numeroBinarioADecimal contiene el valor de la conversión de binario a decimal
     * @return regresa el valor decimal
     */
    public static long convertirDeBinarioADecimal(String numeroBinarioADecimal) {
        long numeroDecimal = 0;
        int exponente = 0;

        for (int i = numeroBinarioADecimal.length() - 1; i >= 0; i--) {
            short digito = 1;
            if (numeroBinarioADecimal.charAt(i) == '0') {
                digito = 0;
            }
            double multiplicador = Math.pow(2, exponente);
            numeroDecimal += digito * multiplicador;
            exponente++;
        }
        return numeroDecimal;
    }

    /**
     * Se encarga de convertir números octales a base 10, decimal
     *
     * @param numeroOctalADecimal contiene el valor de la conversión de octal a decimal
     * @return regresa el valor decimal
     */
    public static int convertirDeOctalADecimal(String numeroOctalADecimal){
        int numeroOctal = Integer.parseInt(numeroOctalADecimal);
        int exponente = 1;
        int numeroDecimal = 0;

        if(numeroOctal == 0){
            numeroDecimal = 0;
        }

        while (numeroOctal >0){
            int residuo = (numeroOctal%10);
            numeroDecimal = (numeroDecimal + (residuo*exponente));
            numeroOctal = numeroOctal/10;
            exponente = exponente * 8;
        }
        return numeroOctal;
    }

    /**
     * Se encarga de convertir números hexadecimales a base 10, decimal
     *
     * @param numeroHexadecimalADecimal contiene el valor de la conversión de hexadecimal a decimal
     * @return regresa el valor decimal
     */
    public static int convertirDeHexadecimalADecimal(String numeroHexadecimalADecimal){
        numeroHexadecimalADecimal.toUpperCase();
        int numeroHexadecimal = Integer.parseInt(numeroHexadecimalADecimal);
        int exponente = 1;
        int numeroDecimal = 0;

        while (numeroHexadecimal >0){
            int residuo = (numeroHexadecimal%10);
            numeroDecimal = (numeroDecimal + (residuo*exponente));
            numeroHexadecimal = numeroHexadecimal/10;
            exponente = exponente * 8;
        }
        switch (numeroHexadecimalADecimal){
            case "A":
                return 10;
            case "B":
                return 11;

            case "C":
                return 12;

            case "D":
                return 13;

            case "E":
                return 14;

            case "F":
                return 15;
            default:
                return Integer.parseInt(numeroHexadecimalADecimal);
        }
    }


}

//hhttps://parzibyte.me/blog/2020/02/21/java-convertir-decimal-octal/
//http://puntocomnoesunlenguaje.blogspot.com/2012/11/decimal-binario-en-java.html
//http://yolanita.blogspot.com/2011/10/algoritmo-de-conversion-de-octal.html
