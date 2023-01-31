package edu.eryx.luciel.lopez.arana.Anotaciones;

public class Notas {

    /*  Los paquetes sólo son m
        El public hace que se pueda llamar desde otros paquetes, a diferencia del pivate
        Para poder usar los métodos que no sean static, se necesita crear un objeto.
        Void no regresa nada, no devuelve valores.
        To-do lo que no sean clses, van en minúscula.
        Las clases empiezan con un verbo, acción
     */

    public static void main(String[] args) {
        //notasFor();
        //notasForEach();
        notasContinue();
    }

    public static void notasFor (){

        for (int i=0; i<10; i++){
            System.out.print("*");
        }

        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void notasForEach(){
        String[] arreglo = {"Perro", "pato", "Jugo", "Ayuda pofavo", "POO"};

        for (String palabra :arreglo){
            System.out.println(palabra);
        }
    }
    /* El coninue hace que se salte parte del código.
        Sólo se usa en ciclos como el while y for.
        Mientras que el break con for y switch
     */
    public static void notasContinue(){
        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                if (i>5 && i<7) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

