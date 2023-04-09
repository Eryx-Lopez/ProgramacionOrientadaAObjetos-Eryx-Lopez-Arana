package reto10;

import reto10.Clases.*;

/**
 * No voy a mentir, aquí probablemente debería de separar un poco más las cosas como en los paquetes de ui y process
 * pero no supe cómo aplicarlo en este caso, así que va directo a esta clase.
 *
 * En Main se crean todas las variables y objetos que se necesiten, y todas las pruebas que necesite para medio
 * entender el tema, y sí fue una especie de práctica más para mí que para la calificación, ehe.
 */
public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        SrEngineer sr = new SrEngineer();
        Employee srCEO = sr;
        trabajar(srCEO);
        System.out.println(srCEO instanceof Interviewer);

        CEO ceo2 = (CEO) new Manager();
        Manager manager = new CEO();
        ceo2.interview();
        interview(manager);


        JrEngineer jr = new SrEngineer();
        SrEngineer sr2 = (SrEngineer) jr;
        programar(jr);
        trabajar(sr2);

        sr.programar();
        sr.trabajar();

        ((SrEngineer) jr).interview();
        sr.interview();

        HR hr = new HR();
        Employee emp3 = new Manager();
        System.out.println(ceo instanceof Manager);
        trabajar(hr);
        interview(hr);
        trabajar(new JrEngineer());

        System.out.println(emp3 instanceof SrEngineer);
    }
     static void trabajar(Employee employee){

     }
    static void programar(Programmer programmer){

    }
    static void interview(Interviewer interviewer){

    }
}

