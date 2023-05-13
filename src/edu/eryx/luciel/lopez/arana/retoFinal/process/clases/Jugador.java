package edu.eryx.luciel.lopez.arana.retoFinal.process.clases;

public class Jugador extends Personaje {

    public Jugador(int vida, int poder, boolean defensa) {
        super(vida, poder, defensa);
    }


    @Override
    public String toString() {
        return "Vida: " + vida + "\n" + "Poder: " + poderDeAtaque;
    }
}
