package edu.eryx.luciel.lopez.arana.reto10.Clases;

/**
 * De nuevo, es la clase manager, que implementa la entrevista y hereda al empleado.
 */
public class Manager extends Employee implements Interviewer {
    @Override
    public void trabajar() {

    }

    @Override
    public void interview() {
        System.out.println("Es el encargado de preguntar sobre la experiencia laboral");
    }

    @Override
    public int compareTo(Employee employee) {
        return name.compareTo(employee.name);
    }
}
