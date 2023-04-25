package edu.eryx.luciel.lopez.arana.reto10.Clases;

/**
 * La clase para un junior, que de nuevo, es un empleado (trabajar), y que a su vez, sabe programar, por eso se usa la interfaz
 * Programmer (programar)
 */
public class JrEngineer extends Employee implements Programmer{
    public JrEngineer() {
    }

    @Override
    public String toString() {
        return "JrEngineer; " +
                name +
                "; Age; " + age +
                "; RFC; " + RFC;
    }

    protected String RFC;

    public JrEngineer(String name, int age, String RFC) {
        super(name, age);
        this.RFC = RFC;
    }

    public JrEngineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void programar() {
        System.out.println("Programa como puede");
    }

    @Override
    public void trabajar() {
        System.out.println("Trabaja nervioso");
    }

    @Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.name);
    }
}
