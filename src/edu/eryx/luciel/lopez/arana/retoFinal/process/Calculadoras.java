package edu.eryx.luciel.lopez.arana.retoFinal.process;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.Process.jugador;

public class Calculadoras {

    public static int multiplicadorDePoderOgro = (int) ((jugador.getOgrosMuertos()* 0.2) +1);
    public static int multiplicadorDePoderHadas = (int) ((jugador.getCasasConstruidas()* 0.1) +1);


}
