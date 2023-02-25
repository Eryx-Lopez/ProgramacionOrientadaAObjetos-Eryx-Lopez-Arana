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

    public static String getRandomMediumWords() {
        List<String> mediumWords = Arrays.asList("furgoneta", "salamandra", "armadura", "arquitectura");
        Random random = new Random();

        int randomitem = random.nextInt(mediumWords.size());
        String randomMediumWords = mediumWords.get(randomitem);

        return randomMediumWords;
    }
    public static String getRandomDifficultWords() {
        List<String> mediumWords = Arrays.asList("electrocardiograma", "anticonstitucional",
                "groenlandia", "hipopotomonstrosesquipedaliofobia");
        Random random = new Random();

        int randomitem = random.nextInt(mediumWords.size());
        String randomDifficultWords = mediumWords.get(randomitem);

        return randomDifficultWords;
    }
    

}

//https://stackoverflow.com/questions/6726963/random-string-from-string-array-list