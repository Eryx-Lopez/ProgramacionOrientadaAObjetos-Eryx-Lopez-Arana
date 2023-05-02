package edu.eryx.luciel.lopez.arana.reto10;
import edu.eryx.luciel.lopez.arana.reto10.Clases.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

 /**
  *
  * No voy a mentir, aquí probablemente debería de separar un poco más las cosas como en los paquetes de ui y process
  * pero no supe cómo aplicarlo en este caso, así que va directo a esta clase.
  * En testClases se crean todas las variables y objetos que se necesiten, y todas las pruebas que necesite para medio
  * entender el tema, y sí fue una especie de práctica más para mí que para la calificación, ehe.
  *
  * Es una prueba de las diferentes clases y herencias que se han manejado en Employee, JrEngineer y SrEngineer, creando variables
  * y objetos, así como polimorfismo.
  */
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


 /**
  * Pone a trabjar
  * @param employee los que caen bajo la categoría de empleados
  */
 static void trabajar (Employee employee){

 }

 /**
  * Pone a programar
  * @param programmer los que caen bajo la categoría de programadores
  */
 static void programar (Programmer programmer){

 }

 /**
  * Pone a entrevistar
  * @param interviewer los que caen bajo la categoría de entrevistadores
  */
 static void interview (Interviewer interviewer){
 }

 /**
  * Se crea una lista con 10 empleados, para luego escribirlos en un archivo de texto.
  */
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
  /* List<String> lines = list
           .stream()
           .map(Employee::toString)
           .collect(Collectors.toList());

   */
   List<String> lines = new ArrayList<>();
   for(Employee line : list){
    lines.add(line.toString());
   }
   Files.write(file, lines);
  } catch (IOException e) {
   e.printStackTrace();
  }
 }

 /**
  * Lee los datos de un archivo, para luego hacer uso de otro método (que no me terminó de salir) para imprimir los empleados
  * que son mayores de 20.
  */
 static void testReadFilterFiles() {
  ArrayList<Employee> readList = new ArrayList<>();
  String fileName = "testWriteFile.txt";
  Path file = Paths.get(fileName);


  List<JrEngineer> jrs = new ArrayList<>();

  try {


   for(String line :Files.readAllLines(file)) {
    String[] splitVal = line.split(";");
    int age = Integer.valueOf(splitVal[3].trim());
    if(age > 19){
    jrs.add(new JrEngineer(splitVal[1], age,splitVal[5]));
       }
   }
   System.out.println(jrs);

   System.out.println("------");


  } catch (IOException e) {
   e.printStackTrace();
  }
 }

 /**
  * Método para leer los datos y almacenar los que son mayores de 20 en edad en una lista.
  * @param employees el tipo de dato (Employee) que almacenará la lista
  * @return todos los empleados que son mayores de 20
  */
 static List<Employee> printOver20Emp(List<Employee> employees) {
  List<Employee> employeesOver20 = Collections.emptyList();
  for (int i = 0; i < employees.size(); i++) {
   if (employees.get(i).getAge() > 20) {
    System.out.println(employees.get(i));
    employeesOver20.add(employees.get(i));

   }

  }return employeesOver20;
  }

 /**
  * Lee el archivo con los nombres y los regresa como un string
  * @param nameeOfFile Nombre del archivo en el que se tienen todos los nombres
  * @return El contenido del archivo pero en string
  */
 static String readFileAsString(String nameeOfFile){
  Path path = Path.of("src/allNames");
  String aux = "";
  try {
   aux = new String(Files.readAllBytes(path));
  } catch (IOException e) {
   throw new RuntimeException(e);
  }return aux;
 }

 /**
  * Convierte los Strings a un objeto de tipo empleado
  * @param emp El string que recibe
  * @return El objeto tipo empleado
  */
 static Employee convertStringToEmployee(String emp){
  String[] aux = emp.split(";");
  Employee employees = null;
  try{
   employees = new JrEngineer(aux[0], Integer.parseInt((aux[1])));
  } catch (Exception e){
   throw new RuntimeException();
  } return employees;
 }

 /**
  * Filtra la lista de los empleados según una edad dada, y luego los imprime
  * @param minAge Edad mínima
  * @param maxAge Edad máxima
  */
 static void printAgeFilter (int minAge, int maxAge){
  ArrayList<Employee> employees = new ArrayList<>();
  System.out.printf("Los empleados dentro de las edades %d y %d son los siguientes:", minAge, maxAge);
  employees.stream()
          .filter(employee -> employee.getAge() > minAge && employee.getAge() < maxAge)
          .forEach(System.out::println);
 }

 /**
  * Ordena los empleados por orden alfabético para luego seleccionar a los empleados que se desee
  * @param limit Límite de cuántos se van a imprimir
  */
 static void printAlphabeticalOrder(int limit){
  System.out.printf("Los primeros %d empleados de la lista son los siguientes", limit);
  ArrayList<Employee> employees = new ArrayList<>();
  employees.stream()
          .map(employee -> employee.getName())
          .sorted()
          .limit(limit)
          .forEach(System.out::println);
 }

 /**
  * Imprime la edad promedio de la lista de los empleados
  */
 static void printAverageAge(){
  ArrayList<Employee> employees = new ArrayList<>();

  System.out.println("El promedio de edad es de: ");
  double averageAge = employees.stream()
          .mapToInt(employee -> Integer.parseInt(employee.split(";")[2]))
          .average()
          .orElse(0.0);
}

 /**
  * Imprime el último empleado después de ordenarlos por edad y luego por nombre
  */
 public static void printLastEmployee(){
  ArrayList<String> strings = new ArrayList<>();
  String lastEmployee = strings.stream()
          .sorted(Comparator.comparingInt((String edad) -> Integer.parseInt(edad.split(";")[2]))
                  .thenComparing(string -> string.split(";")[1])
          )
          .reduce((first, second) -> second)
          .orElse(null);
  System.out.println(lastEmployee);
 }
  static void reto12 (){
  ArrayList<Employee> Employees = new ArrayList<>();

  String stringOfFile = readFileAsString("allNames");
  String[] employees = stringOfFile.split("\n");
  for (var emps : employees){
   Employees.add(convertStringToEmployee(emps));

   printAgeFilter(20, 25);
   printAlphabeticalOrder(10);
   printLastEmployee();


  }

 }
  public static void main (String[]args){
  reto12();
  }

 }


