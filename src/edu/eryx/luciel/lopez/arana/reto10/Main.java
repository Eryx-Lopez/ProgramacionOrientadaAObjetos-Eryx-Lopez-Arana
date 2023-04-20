package edu.eryx.luciel.lopez.arana.reto10;
import edu.eryx.luciel.lopez.arana.reto10.Clases.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * No voy a mentir, aquí probablemente debería de separar un poco más las cosas como en los paquetes de ui y process
 * pero no supe cómo aplicarlo en este caso, así que va directo a esta clase.
 *
 * En Main se crean todas las variables y objetos que se necesiten, y todas las pruebas que necesite para medio
 * entender el tema, y sí fue una especie de práctica más para mí que para la calificación, ehe.
 */
public class Main {

 static void testClases() {
  Employee uno = new JrEngineer();
  Employee dos = new SrEngineer();
  Employee tres = new Manager();

  CEO ceo = new CEO();
  SrEngineer sr = new SrEngineer();
  Employee srCEO = sr;
  trabajar(srCEO);
  System.out.println(srCEO instanceof Interviewer);

  Manager manager = new CEO();
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

  ArrayList<Employee> lista = new ArrayList<>();
  lista.add(new JrEngineer("Mauricio", 18));
  lista.add(new SrEngineer("Antonio", 20));

  System.out.println(lista.stream().sorted().collect(Collectors.toList()));
  System.out.println(lista);

  Collections.sort(lista);
  System.out.println(lista);

  System.out.println(Collections.max(lista, Comparator.comparing(Employee::getName)));

  Collections.sort(lista, Comparator.comparing(Employee::getName));
  System.out.println(lista);

  LinkedList<Employee> linked = new LinkedList<>();

  HashMap<Employee, String> map = new HashMap<>();
  map.put(new JrEngineer("Juanito", 19), "Juanito");
  map.put(new JrEngineer("Mauricio", 18), "Mauricio");
  map.put(new JrEngineer("Antonio", 20), "Antonio");
  JrEngineer jr8 = new JrEngineer("Juanito", 19);
  System.out.println(jr8);
 }


 static void testwriteFiles() {
  ArrayList<Employee> list = new ArrayList<>();
  list.add(new JrEngineer("Juanito", 19));
  list.add(new JrEngineer("Mauricio", 18));
  list.add(new JrEngineer("Antonio", 20));

  String fileName = "testFile.txt";
  Path file = Paths.get(fileName);

  try {
   List<String> lines = list
           .stream()
           .map(Employee::toString)
           .collect(Collectors.toList());

   Files.write(file, lines);
  } catch (IOException e) {
   e.printStackTrace();
  }
 }

 static void testReadFiles() {
  String fileName = "testFile.txt";
  Path file = Paths.get(fileName);
  try {
   for(String line : Files.readAllLines(file)){
    System.out.println(line.split("=")[0]);
    System.out.println(line.split("=")[1]);
   }

  } catch (IOException e) {
   e.printStackTrace();
  }
 }


 static void trabajar(Employee employee) {

 }

 static void programar(Programmer programmer) {

 }

 static void interview(Interviewer interviewer) {
 }

 public static void main(String[] args) {
  testwriteFiles();
  testReadFiles();
 }
}



