import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio1pag75 {
    public static void main(String[] args) {
        // Creamos el Scanner para leer datos de la consola
        Scanner scanner = new Scanner(System.in);

        // Creamos el TreeSet para almacenar los números de forma ordenada
        TreeSet<Double> numeros = new TreeSet<>();

        System.out.println("--- Registro de Números Ordenados ---");

        while (true) {
            System.out.print("Ingresa un número (o escribe 'salir' para terminar): ");
            String entrada = scanner.next();

            // Verificamos si el usuario quiere detener la lectura
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                // Convertimos la entrada a número y la agregamos al TreeSet
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                // Por si el usuario escribe algo que no es un número ni la palabra 'salir'
                System.out.println(" Entrada no válida. Por favor, ingresa un número o 'salir'.");
            }
        }

        // Cerramos el scanner
        scanner.close();

        // Mostramos el resultado final
        System.out.println("\n--- Lista de números ordenados de menor a mayor ---");
        if (numeros.isEmpty()) {
            System.out.println("No ingresaste ningún número.");
        } else {
            for (double num : numeros) {
                System.out.println(num);
            }
        }
    }
}