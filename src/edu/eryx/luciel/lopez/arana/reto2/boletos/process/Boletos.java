/**
 * Precio de los boletos, como el precio de adultos mayores (sin credencial) y niños es el mismo
 * se guardó en una sola variable
 * @param precioMenorYMayor almacena el precio que tienen los boletos de adultos mayores y niños
 * @param precioINAPAM almacena el precio que tiene el boleto de adultos mayores de INAPAM
 * @param precioAdulto almacena el precio que tiene el boleto de adultos
 *
 * @param numBoletosAdulto almacena el número de los boletos de adulto que se pidan por el usuario
 * @param numBoletosMenorYMayor almacena el número de los boletos de adulto mayor y niños que se pidan por el usuario
 * @param numBoletosINAPAM almacena el número de los boletos de adultos mayores INAPAM que se pidan por el usuario
 *
 * @param calcularCosto multiplica el precio de los boletos que se pidieron por la cantidad
 * @return costo total de la cantidad de boletos ordenada
 *
 **/
package edu.eryx.luciel.lopez.arana.reto2.boletos.process;
public class Boletos{


        public static double precioAdulto = 100;
        public static double precioMenorYMayor = 70;

        public static double precioINAPAM = 50;
        public static double calcularCosto(int numBoletosAdulto, int numBoletosMenorYMayor, int numBoletosINAPAM){
        return (numBoletosAdulto * precioAdulto) + (numBoletosINAPAM * precioINAPAM) + (numBoletosMenorYMayor * precioMenorYMayor);
        }
}





