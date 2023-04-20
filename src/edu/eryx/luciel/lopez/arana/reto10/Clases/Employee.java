package edu.eryx.luciel.lopez.arana.reto10.Clases;

import java.util.Objects;

/**
 * Es una clase abstracta que se encarga de hacer trabajar a los empleados, lo cual son, todos
 */
public abstract class Employee implements Comparable <Employee>{
    int age;
    String name;
    public Employee() {
    }

    @Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.name);
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void trabajar(){
        System.out.println("Trabajo genérico");
    };

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
