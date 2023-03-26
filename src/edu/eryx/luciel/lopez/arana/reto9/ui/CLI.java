package edu.eryx.luciel.lopez.arana.reto9.ui;


import edu.eryx.luciel.lopez.arana.reto9.process.Ayudantes;

public class CLI {
    public static void mostrarAyudantes() {
        Ayudantes[] ayudantes = new Ayudantes[5];
        for (int i = 0; i < 5; i++){
            ayudantes[i] = new Ayudantes();
            System.out.println("-----------------------------");
            System.out.println("Su ayudante número " + (i+1) + " tiene...");
            System.out.println(ayudantes[i].getNumOjos() + " ojo(s)");
            System.out.println("Una altura " + ayudantes[i].getAltura());
            System.out.println("La piel de color " + ayudantes[i].getColorDePiel());
            System.out.println("Un nivel de creación de " + ayudantes[i].getNivelDeCreacion());
            System.out.println("Un nivel de arreglo de " + ayudantes[i].getNivelDeArreglo());
            System.out.println("Un nivel de destrucción de " + ayudantes[i].getNivelDeDestruccion());


        }

    }
}
