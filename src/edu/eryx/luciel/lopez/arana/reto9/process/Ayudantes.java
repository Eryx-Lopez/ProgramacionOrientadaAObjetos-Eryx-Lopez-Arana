package edu.eryx.luciel.lopez.arana.reto9.process;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ayudantes {

    public int numOjos;
    public List<String> coloresDePiel = Arrays.asList("amarilla", "morada", "blanca", "marrón");
    public int randomitem;
    public String colorDePiel;
    public List<String> alturas = Arrays.asList("chiquita", "no tan chiquita", "grande", "enorme");
    public String altura;
    public int nivelDeCreacion;
    public int nivelDeArreglo;
    public int nivelDeDestruccion;


    public Ayudantes() {
        Random random = new Random();
        this.numOjos = random.nextInt(4) + 1;
        this.randomitem = randomitem;
        this.colorDePiel = coloresDePiel.get(randomitem = random.nextInt(coloresDePiel.size()));
        this.altura = alturas.get(randomitem = random.nextInt(alturas.size()));
        this.nivelDeCreacion = random.nextInt(5);
        this.nivelDeArreglo = random.nextInt(5);
        this.nivelDeDestruccion = random.nextInt(5);
    }
    public int getNumOjos() {
        return numOjos;
    }

    public String getColorDePiel() {
        return colorDePiel;
    }

    public String getAltura() {
        return altura;
    }

    public int getNivelDeCreacion() {
        return nivelDeCreacion;
    }
    public int getNivelDeArreglo() {
        return nivelDeArreglo;
    }

    public int getNivelDeDestruccion() {
        return nivelDeDestruccion;
    }

}