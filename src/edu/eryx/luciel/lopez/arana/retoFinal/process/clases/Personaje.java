package edu.eryx.luciel.lopez.arana.retoFinal.process.clases;

public class Personaje {
    int vida;
    int poderDeAtaque;
    boolean defensaActiva;
    public Personaje(int vida, int poder, boolean defensa){

        this.vida = vida;
        poderDeAtaque = poder;
        defensaActiva = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public boolean isDefensaActiva() {
        return defensaActiva;
    }

    public void setDefensaActiva(boolean defensaActiva) {
        this.defensaActiva = defensaActiva;
    }

    @Override
    public String toString() {
        return "Vida: " + vida + "\n" + "Poder: " + poderDeAtaque;
    }



}
