package edu.eryx.luciel.lopez.arana.reto5.process;

import java.util.*;

/**
 * Contiene los diferentes modos de juego, fácil, intermedio y difícil junto con el código en común que
 * es el adivinar las palabras que cambian con cada nivel.
 * @author eryxl
 */
public class ModosDeJuego {
    /**
     * para luego dejar que el usuario vaya introduciendo
     * letra por letra hasta encontrar las que sí pertenezcan a la palabra original.
     * <p>
     * Los intentos se guardan en el ArrayList triedLetters, mientras que las ya adivinadas se guardan en guessedLetters
     * Esto se repite hasta que la longitud de las letras adivinadas es igual al de la palabra original (ya se
     * adivinaron todas las letras)
     *
     * @param randomWord la palabra aleatoria que se cambiaría dependiendo del nivel
     */

    public static void playTheGame(String randomWord) {

        ArrayList<String> triedLetters = new ArrayList<>();
        ArrayList<Integer> guessedLetters = new ArrayList<>();
        String letraIntroducida;

        Scanner scanner = new Scanner(System.in);

        while (guessedLetters.size() != randomWord.length()) {

            boolean guessedLetter = false;
            letraIntroducida = scanner.next().toLowerCase();
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == letraIntroducida.charAt(0)) {
                    guessedLetter = true;
                    guessedLetters.add(i);
                }
            }
            if (guessedLetter ) {
                triedLetters.add(letraIntroducida);

                for (int i = 0; i < randomWord.length(); i++) {
                    if (guessedLetters.contains(i)) {
                        System.out.print(randomWord.charAt(i));
                    }
                    else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            } else {
                triedLetters.add(letraIntroducida);
                System.out.println("Noup, intenta otra vez");
            }
        }
    }

    /**
     * Es el método correspondiente al nivel fácil, conteniendo palabras cortas y fáciles de adivinar
     * Las elige dentro de una lista, de forma aleatoria para luego mandar a llamar al método playTheGame,
     * que se encarga de hacer jugable la palabra.
     */
    public static void getRandomEasyWord() {

        List<String> easyWords = Arrays.asList("fuego", "gato", "blanco", "planta");
        Random random = new Random();
        int randomitem = random.nextInt(easyWords.size());
        String randomEasyWord = easyWords.get(randomitem);
        ModosDeJuego.playTheGame(randomEasyWord);
    }

    /**
     * Es el método correspondiente al nivel intermedio, conteniendo palabras un poco más complicadas de adivinar
     * Las elige dentro de una lista, de forma aleatoria para luego mandar a llamar al método playTheGame,
     * que se encarga de hacer jugable la palabra.
     */
    public static void getRandomMediumWord() {
        List<String> mediumWords = Arrays.asList("furgoneta", "salamandra", "armadura", "arquitectura");
        Random random = new Random();
        int randomitem = random.nextInt(mediumWords.size());
        String randomMediumWord = mediumWords.get(randomitem);
        ModosDeJuego.playTheGame(randomMediumWord);
    }

    /**
     * Es el método correspondiente al nivel dificil, conteniendo palabras mucho más difíciles de adivinar
     * Las elige dentro de una lista, de forma aleatoria para luego mandar a llamar al método playTheGame,
     * que se encarga de hacer jugable la palabra.
     */
    public static void getRandomDifficultWord() {
        List<String> difficultWords = Arrays.asList("electrocardiograma", "anticonstitucional",
                "groenlandia", "hipopotomonstrosesquipedaliofobia");
        Random random = new Random();
        int randomitem = random.nextInt(difficultWords.size());
        String randomDifficultWord = difficultWords.get(randomitem);
        ModosDeJuego.playTheGame(randomDifficultWord);
    }


}

//https://stackoverflow.com/questions/6726963/random-string-from-string-array-list