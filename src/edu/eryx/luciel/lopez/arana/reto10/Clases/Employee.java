package edu.eryx.luciel.lopez.arana.reto10.Clases;

/**
 * Es una clase abstracta que se encarga de hacer trabajar a los empleados, lo cual son, todos
 */
public abstract class Employee implements Comparable <Employee>{
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void trabajar();
}
