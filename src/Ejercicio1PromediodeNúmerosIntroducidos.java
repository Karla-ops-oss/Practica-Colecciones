import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1PromediodeNúmerosIntroducidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        String continuar;

        System.out.println("--- Cálculo de Promedio de Números Positivos ---");

        do {
            System.out.print("Ingrese un número numérico positivo: ");
            double num = scanner.nextDouble();

            if (num >= 0) {
                numeros.add(num);
            } else {
                System.out.println("Los números negativos no se toman en cuenta para el promedio.");
            }

            System.out.print("¿Desea introducir otro número? (si/no): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("si"));


        if (numeros.isEmpty()) {
            System.out.println("No se introdujeron números válidos para calcular un promedio.");
        } else {
            double suma = 0;

            for (double n : numeros) {
                suma += n;
            }
            double promedio = suma / numeros.size();

            System.out.println("\n--- Resultados ---");
            System.out.println("Cantidad de números positivos: " + numeros.size());
            System.out.println("El promedio de los números introducidos es: " + promedio);
        }

        scanner.close();
    }
}