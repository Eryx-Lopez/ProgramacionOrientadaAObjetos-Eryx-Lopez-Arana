package edu.eryx.luciel.lopez.arana.reto5.process;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ModosDeJuego {

    public static String getRandomEasyWord(){
        List<String> easyWords = Arrays.asList("fuego", "gato", "blanco", "planta");
        Random random = new Random();

        int randomitem = random.nextInt(easyWords.size());
        String randomEasyWords = easyWords.get(randomitem);

        return randomEasyWords;
    }

    public static String getRandomMediumWord() {
        List<String> mediumWords = Arrays.asList("furgoneta", "salamandra", "armadura", "arquitectura");
        Random random = new Random();

        int randomitem = random.nextInt(mediumWords.size());
        String randomMediumWords = mediumWords.get(randomitem);

        return randomMediumWords;
    }
    public static String getRandomDifficultWord() {
        List<String> mediumWords = Arrays.asList("electrocardiograma", "anticonstitucional",
                "groenlandia", "hipopotomonstrosesquipedaliofobia");
        Random random = new Random();

        int randomitem = random.nextInt(mediumWords.size());
        String randomDifficultWords = mediumWords.get(randomitem);

        return randomDifficultWords;
    }

    public static void encriptedEasyWords(){
        String randomEasyWord = getRandomEasyWord();
        for (int i = 0; i < randomEasyWord.length(); i++) {
            char encriptedEasyWord = 'x';
            System.out.print(encriptedEasyWord);
        }
    }
    public static void encriptedMediumWords(){
        String randomMediumWord = getRandomMediumWord();
        for (int i = 0; i < randomMediumWord.length(); i++) {
            char encriptedMediumWord = 'x';
            System.out.print(encriptedMediumWord);
        }
    }
    public static void encriptedDifficultWords(){
        String randomDifficultWord = getRandomDifficultWord();
        for (int i = 0; i < randomDifficultWord.length(); i++) {
            char encriptedDifficultWord = 'x';
            System.out.print(encriptedDifficultWord);
        }
    }

}

//https://stackoverflow.com/questions/6726963/random-string-from-string-array-list