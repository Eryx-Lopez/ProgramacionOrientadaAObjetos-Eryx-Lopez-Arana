/**
 * Plantilla de menú para facilitar el ingreso de opciones en los demás proyectos, haciendo que no haya necesidad
 * de crear un menú en cada uno de ellos.
 * Crea los textos para elegir una opción, cuando el valor ingresado es incorrecto y cuando no es un número.
 *
 *
 * */


package edu.eryx.luciel.lopez.arana.utils;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
        private String Request_Option = "Por favor elija una opción: ";

        private String Type_Error = "Su valor ingresado debe de ser un número.";

        private String Invalid_Option = "Opción no disponible, por favor introduzca un numero valido";

        private ArrayList<String> optionList = new ArrayList<>();

    /**
     * Agregar una nueva opción al ArrayList
     * @param option la opción que se se decide insertar desde fuera
     * @return la opción
     */
    public Menu addOption(String option) {
            optionList.add(option);
            return this;   //regresa el objeto, que en este caso sería la opción dentro del Arraylist
        }

       public void cleanMenu() {
            optionList.clear();
        }

    /**
     * Imprime el menú con las opciones que se deseen, ya que esas se agregan como objetos del ArrayList
     */
        public void showMenu() {
            System.out.print("Menu");
            for (int i = 0; i < optionList.size(); i++){
                System.out.printf("%d.- %s.", i + 1, optionList.get(i));
            }
            System.out.print(Request_Option);
            System.out.println();
            System.out.printf("%d) %s.\n", optionList.size() + 1, "Salir");

        }

    /**
     * Lee el tipo de respuesta introducida por el usario, si no cuadra dentro del rango de opciones, marca opción inválida
     * Si es de un tipo diferente al que le estamos solicitando, marca opción no disponible
     *
     */
        public int readOption() {

            while (true) {

                try {
                    Scanner scanner = new Scanner(System.in);
                    int numeroOpcion = scanner.nextInt();
                    if (numeroOpcion < 1 || numeroOpcion > optionList.size() + 1) {
                        System.out.print(Invalid_Option);
                        continue;
                    }
                    return numeroOpcion;


                } catch (InputMismatchException error) {
                    System.out.println(Type_Error);
                }
            }
        }
    }
