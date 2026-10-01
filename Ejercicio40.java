import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese lectura anterior de Kwh: ");
        double lectAnterior = scanner.nextDouble();
        System.out.print("Ingrese lectura actual de Kwh: ");
        double lectActual = scanner.nextDouble();

        double consumo = lectActual - lectAnterior;
        double tarifaKwh;

        if (consumo <= 100) {
            tarifaKwh = 2622.00;
        } else if (consumo <= 300) {
            tarifaKwh = 79.78;
        } else if (consumo <= 500) {
            tarifaKwh = 89.52;
        } else {
            tarifaKwh = 97.95;
        }

        double montoPagar = consumo * tarifaKwh;

        System.out.printf("Consumo total: %.2f Kwh%n", consumo);
        System.out.printf("Monto a pagar por servicio: %.2f Bs.%n", montoPagar);

        scanner.close();
    }
}