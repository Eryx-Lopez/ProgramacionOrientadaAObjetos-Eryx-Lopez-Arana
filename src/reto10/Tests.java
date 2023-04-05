package reto10;

import reto10.Clases.*;

public class Tests {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        HR hr = new HR();
        JrEngineer jr = new JrEngineer();
        Manager manager = new Manager();
        SrEngineer sr = new SrEngineer();
       /* System.out.println("Programar");
        jr.programar();
        sr.programar();
        */

        JrEngineer jr2 = new SrEngineer();
        SrEngineer sr2 = (SrEngineer) jr2;
        jr2.programar();
        sr2.programar();

        Employee emp = jr2;
        Employee emp2 = new CEO();
        Employee emp3 = new Manager();
      // System.out.println(emp instanceof SrEngineer); true
      // System.out.println(emp2 instanceof SrEngineer); false
        trabajar(new HR());
        trabajar(new JrEngineer());

    }
     static void trabajar(Employee employee){

     }
    static void programar(Programmer programmer){

    }
    static void interview(Interviewer interviewer){

    }
}

