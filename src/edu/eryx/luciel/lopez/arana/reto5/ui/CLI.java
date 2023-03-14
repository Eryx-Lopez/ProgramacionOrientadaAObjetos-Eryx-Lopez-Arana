package edu.eryx.luciel.lopez.arana.reto5.ui;

import edu.eryx.luciel.lopez.arana.reto5.process.ModosDeJuego;
import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

/**
 * Se encarga de lo relacionado con el menú, añadiendo las opciones de dificultad para luego encargarse
 * de ejecutar la acción correspondiente
 *
 * Se usa el menú del paquete utils.
 *
 * @author eryxl
 */
public class CLI {
    private static void alternativeExit (){
        String alternativeExitNumber = "0";
        if (alternativeExitNumber.equals("0")){
            menu
                    .killMenu();
        }
    }
    private static String instruction = "¡Adivina la palabra letra por letra!";
    private static String easyMode = ">>Modo Fácil<<";
    private static String mediumMode = ">>Modo Intermedio<<";
    private static String difficultMode = ">>Modo Difícil<<";

    private static String selectEasyOption = "Fácil";
    private static String selectMeduimOption = "Intermedio";
    private static String selectDifficultOption = "Difícil";
    private static Menu menu = new Menu();
    /**
     * Es la acción encargada de correr el modo fácil
     */
    private static MenuAction easyAction = (scanner) -> {
        System.out.println(easyMode);
        System.out.println(instruction);
        String randomEasyWords = "";
        ModosDeJuego.getRandomEasyWord();
        System.out.println(randomEasyWords);
        System.out.println();
        alternativeExit();
    };

    /**
     * Es la acción encargada de correr el modo intermedio
     */
    private static MenuAction mediumAction = (scanner) -> {
        System.out.println(mediumMode);
        System.out.println(instruction);
        String randomMediumWords = "";
        ModosDeJuego.getRandomMediumWord();
        System.out.println(randomMediumWords);
        System.out.println();
        alternativeExit();
    };
    /**
     * Es la acción encargada de correr el modo difícil
     */
    private static MenuAction difficultAction = (scanner) -> {
        alternativeExit();
        System.out.println(difficultMode);
        System.out.println(instruction);
        String randomDifficultWords = "";
        ModosDeJuego.getRandomDifficultWord();
        System.out.println(randomDifficultWords);
        System.out.println();
        alternativeExit();
    };

    static {
        menu
                .addOption(selectEasyOption, easyAction);
        menu
                .addOption(selectMeduimOption, mediumAction);
        menu
                .addOption(selectDifficultOption, difficultAction);
        menu
                .createMenu();

    }

    /**
     * Ejecuta el menú, mientras este viva, es decir, mientras el usuario no decida salir de él (última opción,
     * en este caso la cuatro)
     */
    public static void playGame(){
        do {
            menu.showMenu();
            var option = menu.readOption();
            menu.selectAndRunOption(option);
        } while (menu.isAlive());



}





}
