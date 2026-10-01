import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del trabajador (1-4): ");
        int categoria = scanner.nextInt();

        System.out.print("Ingrese el sueldo actual: $");
        double sueldo = scanner.nextDouble();

        double aumento = 0;

        if (categoria == 1) {
            aumento = sueldo * 0.15;
        } else if (categoria == 2) {
            aumento = sueldo * 0.10;
        } else if (categoria == 3) {
            aumento = sueldo * 0.08;
        } else if (categoria == 4) {
            aumento = sueldo * 0.07;
        } else {
            System.out.println("Categoría no válida.");
        }

        if (categoria >= 1 && categoria <= 4) {
            double nuevoSueldo = sueldo + aumento;
            System.out.println("Categoría: " + categoria);
            System.out.printf("Nuevo sueldo: $%.2f%n", nuevoSueldo);
        }

        scanner.close();
    }
}