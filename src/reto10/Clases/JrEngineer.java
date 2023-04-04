package reto10.Clases;

public class JrEngineer extends Employee implements Programmer{
    @Override
    public void programar() {
        System.out.println("Programa como puede");
    }

    @Override
    void trabajar() {
        System.out.println(" ");
    }
}
