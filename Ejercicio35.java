import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double temp = scanner.nextDouble();

        String deporte;

        if (temp > 85) {
            deporte = "Natación";
        } else if (temp > 32) {
            deporte = "Tenis";
        } else if (temp > 10) {
            deporte = "Golf";
        } else if (temp > 0) {
            deporte = "Esquí";
        } else {
            deporte = "Marcha";
        }

        System.out.println("Para la temperatura " + temp + "°F se recomienda practicar: " + deporte);

        scanner.close();
    }
}