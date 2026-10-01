import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente A: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente B: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente C: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado (A no puede ser 0).");
        } else {
            double d = Math.pow(b, 2) - 4 * a * c;

            if (d == 0) {
                double x = -b / (2 * a);
                System.out.printf("Discriminante D = 0. Solución única:%n");
                System.out.printf("X1 = X2 = %.2f%n", x);
            } else if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Discriminante D > 0. Dos soluciones reales distintas:%n");
                System.out.printf("X1 = %.2f%n", x1);
                System.out.printf("X2 = %.2f%n", x2);
            } else {
                System.out.println("Discriminante D < 0. No tiene solución en los Reales.");
            }
        }

        scanner.close();
    }
}