package edu.eryx.luciel.lopez.arana.reto10;
import edu.eryx.luciel.lopez.arana.reto10.Clases.*;

import java.io.File;
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
  list.add(new JrEngineer("Kvothe", 19, "DHKE7820471H8"));
  list.add(new JrEngineer("Juan Arcadio", 36, "AJEC3284934E2"));
  list.add(new JrEngineer("Frederick", 53, "GJEO4856932M9"));
  list.add(new JrEngineer("América", 18, "CIEM5685738A1"));
  list.add(new JrEngineer("Maxon", 20, "MCJE8928741N9"));
  list.add(new JrEngineer("Elliot ", 29, "ALOP2983970E5"));
  list.add(new JrEngineer("Theodore", 26, "LOMP190598L7"));
  list.add(new JrEngineer("Aristóteles", 19, "HYUM4512902U8"));
  list.add(new JrEngineer("Chris", 26, "YRLN2893969M1"));
  list.add(new JrEngineer("Victor", 32, "HLME679593J8"));


  String fileName = "testWriteFile.txt";
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
  ArrayList<Employee> readList = new ArrayList<>();
  String fileName = "testReadFile.txt";
  Path file = Paths.get(fileName);

  try {


   for (String line : Files.readAllLines(file)) {
    List<String> lines = readList
            .stream()
            .map(Employee::toString)
            .collect(Collectors.toList());
    System.out.println(line);
    List<Employee> employeesOver20 = new ArrayList<>();
    for(int i = 0; i< line.length(); i++){
     employeesOver20.add(new JrEngineer());
     printOver20Emp(employeesOver20);
    }
   }

   System.out.println("------");


  } catch (IOException e) {
   e.printStackTrace();
  }
 }

 static List<Employee> printOver20Emp(List<Employee> employees) {
  List<Employee> employeesOver20 = Collections.emptyList();
  for (int i = 0; i < employees.size(); i++) {
   if (employees.get(i).getAge() > 20) {
    System.out.println(employees.get(i));
    employeesOver20.add(employees.get(i));

   }

  }return employeesOver20;
  }

  static void trabajar (Employee employee){

  }

  static void programar (Programmer programmer){

  }

  static void interview (Interviewer interviewer){
  }

  public static void main (String[]args){
   testwriteFiles();
   testReadFiles();
  }
 }


