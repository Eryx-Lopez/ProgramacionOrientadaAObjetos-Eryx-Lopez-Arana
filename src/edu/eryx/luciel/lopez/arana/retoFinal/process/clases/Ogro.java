package edu.eryx.luciel.lopez.arana.retoFinal.process.clases;

/**
 * Es la clase Ogro que hereda de Personaje
 */
public class Ogro extends Personaje {
    public Ogro(int vida, int poder, boolean defensa) {
        super(vida, poder, defensa);
    }
    public boolean indicadorOgro = false;
    @Override
    public String toString() {
        return "Vida del ogro: " + vida  + "         Poder del ogro: " + poderDeAtaque;
    }


}
