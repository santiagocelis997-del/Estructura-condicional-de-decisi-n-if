import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese devaluación total estimada del auto a 3 años ($): ");
        double devaluacionAuto = scanner.nextDouble();

        System.out.print("Ingrese incremento total estimado del valor del terreno a 3 años ($): ");
        double incrementoTerreno = scanner.nextDouble();

        if (devaluacionAuto <= (incrementoTerreno / 2.0)) {
            System.out.println("Decisión: SÍ debe comprar el automóvil.");
        } else {
            System.out.println("Decisión: NO debe comprar el automóvil (Conviene el terreno).");
        }

        scanner.close();
    }
}