package edu.eryx.luciel.lopez.arana.retoFinal.process.clases;

public class Jugador extends Personaje {

    public static int madera = 0;
    public static int maderaTotal = 0;
    public static int getMadera() {
        return madera;
    }

    public static void setMadera(int madera) {
        Jugador.madera = madera;
    }

    public static int getMaderaTotal() {
        return maderaTotal;
    }

    public static void setMaderaTotal(int maderaTotal) {
        Jugador.maderaTotal = maderaTotal;
    }


    public static int hojas = 0;
    public static int hojasTotal = 0;


    public static int getHojas() {
        return hojas;
    }

    public static void setHojas(int hojas) {
        Jugador.hojas = hojas;
    }
    public static int getHojasTotal() {
        return hojasTotal;
    }

    public static void setHojasTotal(int hojasTotal) {
        Jugador.hojasTotal = hojasTotal;
    }

    public static int hadasRescatadas = 0;
    public static int hadasConCasa = 0;
    public static int getHadasRescatadas() {
        return hadasRescatadas;
    }

    public static void setHadasRescatadas(int hadasRescatadas) {
        Jugador.hadasRescatadas = hadasRescatadas;
    }

    public static int getHadasConCasa() {
        return hadasConCasa;
    }

    public static void setHadasConCasa(int hadasConCasa) {
        Jugador.hadasConCasa = hadasConCasa;
    }


    public static int ogrosMuertos = 0;

    public static void setOgrosMuertos(int ogrosMuertos) {
        Jugador.ogrosMuertos = ogrosMuertos;
    }

    public static int getOgrosMuertos() {
        return ogrosMuertos;
    }

    public Jugador(int vida, int poder, boolean defensa) {
        super(vida, poder, defensa);
    }



    @Override
    public String toString() {
        return "Vida: " + vida  + "                  Poder: " + poderDeAtaque;
    }
}
