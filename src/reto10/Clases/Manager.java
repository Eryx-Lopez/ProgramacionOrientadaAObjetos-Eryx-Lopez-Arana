package reto10.Clases;

public class Manager extends Employee implements Interviewer {
    @Override
    void trabajar() {

    }

    @Override
    public void interview() {
        System.out.println("Es el encargado de preguntar sobre la experiencia laboral");
    }
}
