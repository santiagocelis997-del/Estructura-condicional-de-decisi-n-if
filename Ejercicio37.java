import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese lado C: ");
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Los lados corresponden a un triángulo válido.");

            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }

            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Área del triángulo: %.2f%n", area);
        } else {
            System.out.println("Los valores ingresados NO forman un triángulo.");
        }

        scanner.close();
    }
}