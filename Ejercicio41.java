import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la superficie en hectáreas: ");
        double hectareas = scanner.nextDouble();

        double metrosCuadrados = hectareas * 10000;
        double pctPino, pctOyamel, pctCedro;

        if (metrosCuadrados > 1000000) {
            pctPino = 0.70;
            pctOyamel = 0.20;
            pctCedro = 0.10;
        } else {
            pctPino = 0.50;
            pctOyamel = 0.30;
            pctCedro = 0.20;
        }

        double areaPino = metrosCuadrados * pctPino;
        double areaOyamel = metrosCuadrados * pctOyamel;
        double areaCedro = metrosCuadrados * pctCedro;

        long numPinos = Math.round((areaPino / 10.0) * 8);
        long numOyameles = Math.round((areaOyamel / 15.0) * 15);
        long numCedros = Math.round((areaCedro / 18.0) * 10);

        System.out.println("Superficie en m²: " + metrosCuadrados);
        System.out.println("Número de Pinos a sembrar: " + numPinos);
        System.out.println("Número de Oyameles a sembrar: " + numOyameles);
        System.out.println("Número de Cedros a sembrar: " + numCedros);

        scanner.close();
    }
}