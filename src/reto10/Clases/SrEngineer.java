package reto10.Clases;

public class SrEngineer extends JrEngineer implements Interviewer {
    @Override
    public void programar() {
        System.out.println("Programa como quiere");
    }

    @Override
    public void interview() {
        System.out.println("Es el encargado de preguntar las cosas técnicas");
    }

    @Override
    public void trabajar() {
        System.out.println("Trabaja con tremenda seguridad");
    }
}
