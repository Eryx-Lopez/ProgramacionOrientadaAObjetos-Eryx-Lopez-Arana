package reto10.Clases;

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
