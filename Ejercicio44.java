import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la inversión total requerida para el negocio: $");
        double inversionTotal = scanner.nextDouble();

        System.out.print("Ingrese el monto ofrecido por la hipoteca de la casa: $");
        double hipoteca = scanner.nextDouble();

        double miInversion, inversionSocio;

        if (hipoteca < 1000000) {
            miInversion = inversionTotal * 0.50;
            inversionSocio = inversionTotal * 0.50;
        } else {
            miInversion = hipoteca;
            double resto = inversionTotal - hipoteca;
            if (resto > 0) {
                miInversion += (resto / 2.0);
                inversionSocio = resto / 2.0;
            } else {
                inversionSocio = 0;
            }
        }

        System.out.printf("%nAporte del dueño: $%.2f%n", miInversion);
        System.out.printf("Aporte del socio: $%.2f%n", inversionSocio);

        scanner.close();
    }
}