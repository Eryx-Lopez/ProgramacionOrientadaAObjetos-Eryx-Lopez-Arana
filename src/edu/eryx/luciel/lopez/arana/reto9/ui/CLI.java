package edu.eryx.luciel.lopez.arana.reto9.ui;


import edu.eryx.luciel.lopez.arana.reto9.process.Ayudantes;

public class CLI {
    public static void mostrarAyudantes() {
        Ayudantes[] ayudantes = new Ayudantes[5];
        for (int i = 0; i < 5; i++){
            ayudantes[i] = new Ayudantes();
            System.out.println("Su ayudante número " + (i+1) + "tiene...");
            System.out.println(ayudantes[i].getNumOjos() + "ojos");
        }

    }
}
