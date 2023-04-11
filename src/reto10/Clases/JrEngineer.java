package reto10.Clases;

/**
 * La clase para un junior, que de nuevo, es un empleado (trabajar), y que a su vez, sabe programar, por eso se usa la interfaz
 * Programmer (programar)
 */
public class JrEngineer extends Employee implements Programmer{
    @Override
    public void programar() {
        System.out.println("Programa como puede");
    }

    @Override
    public void trabajar() {
        System.out.println("Trabaja nervioso");
    }
}
