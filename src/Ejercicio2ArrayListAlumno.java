import java.util.ArrayList;

public class Ejercicio2ArrayListAlumno {
    public static void main(String[] args) {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();


        Alumno al1 = new Alumno("ALU001", "Ana Gómez", "AG23001");
        Alumno al2 = new Alumno("ALU002", "Carlos Pérez", "CP23042");
        Alumno al3 = new Alumno("ALU003", "María López", "ML22015");



        listaAlumnos.add(al1);
        listaAlumnos.add(al2);
        listaAlumnos.add(al3);


        System.out.println("--- Lista de Alumnos (ArrayList) ---");
        for (Alumno al : listaAlumnos) {
            System.out.println("Código: " + al.getCodigo() +
                    " | Nombre: " + al.getNombre() +
                    " | Carnet: " + al.getCarnet());
        }
    }
}