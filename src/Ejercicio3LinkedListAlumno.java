import java.util.LinkedList;

public class Ejercicio3LinkedListAlumno {
    public static void main(String[] args) {

        LinkedList<Alumno> listaAlumnosLinked = new LinkedList<>();


        Alumno al1 = new Alumno("ALU004", "Luis Martínez", "LM21009");
        Alumno al2 = new Alumno("ALU005", "Elena Rostrán", "ER24088");
        Alumno al3 = new Alumno("ALU006", "Jorge Buendía", "JB20031");


        listaAlumnosLinked.add(al1);
        listaAlumnosLinked.add(al2);
        listaAlumnosLinked.add(al3);


        System.out.println("--- Lista de Alumnos (LinkedList) ---");
        for (Alumno al : listaAlumnosLinked) {
            System.out.println("Código: " + al.getCodigo() +
                    " | Nombre: " + al.getNombre() +
                    " | Carnet: " + al.getCarnet());
        }
    }
}