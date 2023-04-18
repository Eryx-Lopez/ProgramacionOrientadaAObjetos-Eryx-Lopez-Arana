package edu.eryx.luciel.lopez.arana.reto10.Clases;

import java.util.Objects;

/**
 * Es una clase abstracta que se encarga de hacer trabajar a los empleados, lo cual son, todos
 */
public abstract class Employee implements Comparable <Employee>{
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
    protected String name;
    public void setName(String name) {
        this.name = name;
    }
    protected int age;

    protected String phoneNumber;
    public String getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
    }

    public abstract void trabajar();


}
