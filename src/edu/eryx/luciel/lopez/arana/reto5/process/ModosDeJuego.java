package edu.eryx.luciel.lopez.arana.reto5.process;

public class ModosDeJuego {

    private static String getRandomEasyWord(){
        int random = (int) (Math.random()*4);
        String easyWords = new String[] {"fuego", "gato", "blanco", "planta"}[random];
        return easyWords;
        }

    private static String getRandomMediumWords() {
        int random = (int) (Math.random()*4);
        String mediumWords = new String[] { "furgoneta", "salamandra", "armadura", "arquitectura"}[random];
        return mediumWords;
    }
    private static String getRandomDifficultWords() {
            int random = (int) (Math.random()*4);
            String difficultWords = new String[] { "electrocardiograma", "anticonstitucional",
                    "groenlandia", "hipopotomonstrosesquipedaliofobia"}[random];
        return difficultWords;
    }


    public static String easyMode(){

    }
}

//https://stackoverflow.com/questions/6726963/random-string-from-string-array-list