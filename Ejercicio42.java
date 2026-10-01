import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad en meses (ej. 0.5 para medio mes, 12 para 1 año, 180 para 15 años): ");
        double edadMeses = scanner.nextDouble();

        System.out.print("Ingrese el sexo (H/M): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese nivel de hemoglobina (g%): ");
        double hemo = scanner.nextDouble();

        double minHemo = 0;

        if (edadMeses >= 0 && edadMeses <= 1) {
            minHemo = 13.0;
        } else if (edadMeses > 1 && edadMeses <= 6) {
            minHemo = 10.0;
        } else if (edadMeses > 6 && edadMeses <= 12) {
            minHemo = 11.0;
        } else if (edadMeses > 12 && edadMeses <= 60) { // 1 a 5 años
            minHemo = 11.5;
        } else if (edadMeses > 60 && edadMeses <= 120) { // 5 a 10 años
            minHemo = 12.6;
        } else if (edadMeses > 120 && edadMeses <= 180) { // 10 a 15 años
            minHemo = 13.0;
        } else if (edadMeses > 180) { // Mayor a 15 años
            if (sexo == 'M') {
                minHemo = 12.0;
            } else {
                minHemo = 14.0;
            }
        }

        if (hemo < minHemo) {
            System.out.println("Resultado: POSITIVO para Anemia.");
        } else {
            System.out.println("Resultado: NEGATIVO para Anemia.");
        }

        scanner.close();
    }
}