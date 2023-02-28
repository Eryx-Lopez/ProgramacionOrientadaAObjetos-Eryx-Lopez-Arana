package edu.eryx.luciel.lopez.arana.reto5.process;

import java.util.*;

/**
 * Contiene los diferentes modos de juego, fácil, intermedio y difícil
 * @author eryxl
 */
public class ModosDeJuego {
    /**
     * Es el método correspondiente al nivel fácil, conteniendo palabras cortas y fáciles de adivinar
     * Las elige dentro de una lista, de forma aleatoria, para luego dejar que el usuario vaya introduciendo
     * letra por letra hasta encontrar las que sí pertenezcan a la palabra original.
     *
     * Los intentos se guardan en el ArrayList triedLetters, mientras que las ya adivinadas se guardan en guessedLetters
     * Esto se repite hasta que la longitud de las letras adivinadas es igual al de la palabra original (ya se
     * adivinaron todas las letras)
     */
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

    /**
     * Hace exactamente lo mismo que la función pasada, sólo que con las palabras de dificultad media
     * Nota: aquí es cuando me di cuenta que justo por eso lo pude haber separado, pero creo que ya es muy tarde para eso
     */
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
    /**
     * Hace exactamente lo mismo que la función pasada, sólo que con las palabras de dificultad media
     *
     */
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