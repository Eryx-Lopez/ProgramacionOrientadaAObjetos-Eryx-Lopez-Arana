package edu.eryx.luciel.lopez.arana.retoFinal.process.clases;

public class Personaje {
    int vidaInicial;
    int poder;

    @Override
    public String toString() {
        return "Vida: " + vidaInicial + "\n" + "Poder: " + poder;
    }

    public Personaje(int v, int p){

        vidaInicial = v ;
        poder = p;
    }

}
