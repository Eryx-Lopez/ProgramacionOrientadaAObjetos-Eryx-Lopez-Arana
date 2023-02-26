package edu.eryx.luciel.lopez.arana.reto5.ui;

import edu.eryx.luciel.lopez.arana.reto5.process.ModosDeJuego;
import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

public class CLI {

    private static String easyMode = ">>Modo Fácil<<";
    private static String mediumMode = ">>Modo Intermedio<<";
    private static String difficultMode = ">>Modo Difícil<<";

    private static String selectEasyOption = "Fácil";
    private static String selectMeduimOption = "Intermedio";
    private static String selectDifficultOption = "Difícil";
    private static Menu menu = new Menu();
    private static MenuAction easyAction = (scanner) -> {
        System.out.println(easyMode);
        String randomEasyWords = "";
        ModosDeJuego.getRandomEasyWord();
        System.out.println(randomEasyWords);
        System.out.println();
    };

    private static MenuAction mediumAction = (scanner) -> {
        System.out.println(mediumMode);
        String randomMediumWords = "";
        ModosDeJuego.getRandomMediumWord();
        System.out.println(randomMediumWords);

        System.out.println();
    };
    private static MenuAction difficultAction = (scanner) -> {
        System.out.println(difficultMode);
        String randomDifficultWords = "";
        ModosDeJuego.getRandomDifficultWord();
        System.out.println(randomDifficultWords);

        System.out.println();
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
    public static void playGame(){
        do {
            menu.showMenu();
            var option = menu.readOption();
            menu.selectAndRunOption(option);
        } while (menu.isAlive());



}





}
