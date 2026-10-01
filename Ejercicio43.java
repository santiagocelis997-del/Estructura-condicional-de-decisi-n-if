import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el saldo del capital actual: $");
        double capitalActual = scanner.nextDouble();

        double prestamo = 0;
        double nuevoSaldo = capitalActual;

        if (capitalActual < 0) {
            prestamo = 10000 - capitalActual;
            nuevoSaldo = 10000;
        } else if (capitalActual <= 20000) {
            prestamo = 20000 - capitalActual;
            nuevoSaldo = 20000;
        } else {
            prestamo = 0;
            nuevoSaldo = capitalActual;
        }

        double equipoComputo = 5000;
        double mobiliario = 2000;
        double resto = nuevoSaldo - (equipoComputo + mobiliario);

        double insumos = resto / 2.0;
        double incentivos = resto / 2.0;

        System.out.printf("%nPréstamo bancario solicitado: $%.2f%n", prestamo);
        System.out.printf("Monto para Insumos: $%.2f%n", insumos);
        System.out.printf("Monto para Incentivos al personal: $%.2f%n", incentivos);

        scanner.close();
    }
}