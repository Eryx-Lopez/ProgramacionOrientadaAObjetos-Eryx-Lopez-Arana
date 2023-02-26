package edu.eryx.luciel.lopez.arana.reto5.process;

import java.lang.reflect.Array;
import java.util.*;

public class ModosDeJuego {

    public static void getRandomEasyWord() {

        List<String> easyWords = Arrays.asList("fuego", "gato", "blanco", "planta");
        Random random = new Random();
        int randomitem = random.nextInt(easyWords.size());
        String randomEasyWord = easyWords.get(randomitem);

        ArrayList<String> triedLetters = new ArrayList<>();
        ArrayList<Integer> guessedLetters = new ArrayList<>();
        String letraIntroducida;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Adivina la palabra letra por letra!");

        while (guessedLetters.size() != randomEasyWord.length()) {

            boolean guessedLetter = false;
            letraIntroducida = scanner.next().toLowerCase();
            for (int i = 0; i < randomEasyWord.length(); i++) {
                if (randomEasyWord.charAt(i) == letraIntroducida.charAt(0)) {
                    guessedLetter = true;
                    guessedLetters.add(i);
                }
            }
            if (guessedLetter) {
                triedLetters.add(letraIntroducida);

                for (int i = 0; i < randomEasyWord.length(); i++) {
                    if (guessedLetters.contains(i)) {
                        System.out.print(randomEasyWord.charAt(i));
                    }
                    else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
            else {
                triedLetters.add(letraIntroducida);
                System.out.println("Noup, intenta otra vez");
            }

        }

    }
    public static void getRandomMediumWord() {
        List<String> mediumWords = Arrays.asList("furgoneta", "salamandra", "armadura", "arquitectura");
        Random random = new Random();
        int randomitem = random.nextInt(mediumWords.size());
        String randomMediumWord = mediumWords.get(randomitem);

        ArrayList<String> triedLetters = new ArrayList<>();
        ArrayList<Integer> guessedLetters = new ArrayList<>();
        String letraIntroducida;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Adivina la palabra letra por letra!");

        while (guessedLetters.size() != randomMediumWord.length()) {

            boolean guessedLetter = false;
            letraIntroducida = scanner.next().toLowerCase();
            for (int i = 0; i < randomMediumWord.length(); i++) {
                if (randomMediumWord.charAt(i) == letraIntroducida.charAt(0)) {
                    guessedLetter = true;
                    guessedLetters.add(i);
                }
            }
            if (guessedLetter) {
                triedLetters.add(letraIntroducida);

                for (int i = 0; i < randomMediumWord.length(); i++) {
                    if (guessedLetters.contains(i)) {
                        System.out.print(randomMediumWord.charAt(i));
                    }
                    else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
            else {
                triedLetters.add(letraIntroducida);
                System.out.println("Noup, intenta otra vez");
            }

        }
    }
    public static void getRandomDifficultWord(){
        List<String> difficultWords = Arrays.asList("electrocardiograma", "anticonstitucional",
                "groenlandia", "hipopotomonstrosesquipedaliofobia");
        Random random = new Random();
        int randomitem = random.nextInt(difficultWords.size());
        String randomDifficultWord = difficultWords.get(randomitem);

        ArrayList<String> triedLetters = new ArrayList<>();
        ArrayList<Integer> guessedLetters = new ArrayList<>();
        String letraIntroducida;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Adivina la palabra letra por letra!");

        while (guessedLetters.size() != randomDifficultWord.length()) {

            boolean guessedLetter = false;
            letraIntroducida = scanner.next().toLowerCase();
            for (int i = 0; i < randomDifficultWord.length(); i++) {
                if (randomDifficultWord.charAt(i) == letraIntroducida.charAt(0)) {
                    guessedLetter = true;
                    guessedLetters.add(i);
                }
            }
            if (guessedLetter) {
                triedLetters.add(letraIntroducida);

                for (int i = 0; i < randomDifficultWord.length(); i++) {
                    if (guessedLetters.contains(i)) {
                        System.out.print(randomDifficultWord.charAt(i));
                    }
                    else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
            else {
                triedLetters.add(letraIntroducida);
                System.out.println("Noup, intenta otra vez");
            }

        }

    }

}

//https://stackoverflow.com/questions/6726963/random-string-from-string-array-list