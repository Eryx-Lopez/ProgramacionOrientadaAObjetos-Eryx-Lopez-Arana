package reto10.Clases;

public class HR extends Employee implements Interviewer {
    @Override
    void trabajar() {
        System.out.println("Trabaja intenanto no ser la cara amargada de la empresa");
    }

    @Override
    public void interview() {
        System.out.println("El encargado de preguntarte sobre ti y sobre la empresa");
    }
}
