package edu.eryx.luciel.lopez.arana.retoFinal.process.clases;

public class Ogro extends Personaje {
    public Ogro(int vida, int poder, boolean defensa) {
        super(vida, poder, defensa);
    }

    @Override
    public String toString() {
        return "Vida del ogro: " + vida + "\n" + "Poder del ogro: " + poderDeAtaque;
    }

    public int poderDeAtaque(){

        return 0;
    }

}
