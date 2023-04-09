package reto10.Clases;

/** Esta es la clase de recursos humanos, la cual hereda de lo que es el empleado (trabajar), así como el encargado de
 * entrevistar, hace uso de la interfaz Interviewer
 */
public class HR extends Employee implements Interviewer {
    @Override
    void trabajar() {
        System.out.println("Trabaja intentando no ser la cara amargada de la empresa");
    }

    @Override
    public void interview() {
        System.out.println("El encargado de preguntarte sobre ti y sobre la empresa");
    }

}
