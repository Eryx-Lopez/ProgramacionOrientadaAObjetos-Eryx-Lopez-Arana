package reto10.Clases;

public class HR extends Employee implements Interviewer {
    @Override
    void trabajar() {

    }

    @Override
    public void interview() {
        System.out.println("El encargado de preguntarte sobre ti y sobre la empresa");
    }
}
