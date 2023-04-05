package edu.eryx.luciel.lopez.arana.reto9.Parte2.process;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Aquí creamos lsa características que va a tener nuestro ayudante, así como las listas con los valores
 * que queremos que tenga, como es el color de piel y la altura, que en este caso son todas de strings,
 * esto lo hice para hacerlo un poco más dinámico.
 * También se crean las características del número de ojos, y los niveles de creación, arreglo y destrucción.
 */
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

    /**
     * Aquí inicializamos las características y se les asigna un valor
     */
    public Ayudantes() {
        Random random = new Random();
        this.numOjos = random.nextInt(4) + 1;
        this.colorDePiel = coloresDePiel.get(randomitem = random.nextInt(coloresDePiel.size()));
        this.altura = alturas.get(randomitem = random.nextInt(alturas.size()));
        this.nivelDeCreacion = random.nextInt(5);
        this.nivelDeArreglo = random.nextInt(5);
        this.nivelDeDestruccion = random.nextInt(5);
    }

    /**
     *
     * @return El número de ojos que tendrá el ayudante
     */
    public int getNumOjos() {
        return numOjos;
    }

    /**
     *
     * @return  El color de piel que tendrá el ayudante
     */
    public String getColorDePiel() {
        return colorDePiel;
    }

    /**
     *
     * @return La altura que tendrá el ayudante
     */
    public String getAltura() {
        return altura;
    }

    /**
     *
     * @return El nivel de creación que tendrá el ayudante
     */
    public int getNivelDeCreacion() {
        return nivelDeCreacion;
    }

    /**
     *
     * @return El nivel de arreglo que tendrá el ayudante
     */
    public int getNivelDeArreglo() {
        return nivelDeArreglo;
    }

    /**
     *
     * @return El nivel de destrucción que tendrá el ayudante
     */
    public int getNivelDeDestruccion() {
        return nivelDeDestruccion;
    }

}