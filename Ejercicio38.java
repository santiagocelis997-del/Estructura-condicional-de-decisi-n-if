import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese año de nacimiento: ");
        int anioNac = scanner.nextInt();

        System.out.print("Ingrese año actual: ");
        int anioActual = scanner.nextInt();

        int edad = anioActual - anioNac;
        String signo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) signo = "Aries";
        else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) signo = "Tauro";
        else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) signo = "Géminis";
        else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) signo = "Cáncer";
        else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) signo = "Leo";
        else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) signo = "Virgo";
        else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) signo = "Libra";
        else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 22)) signo = "Escorpio";
        else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) signo = "Sagitario";
        else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) signo = "Capricornio";
        else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) signo = "Acuario";
        else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) signo = "Piscis";
        else signo = "Fecha no válida";

        System.out.println("Signo Zodiacal: " + signo);
        System.out.println("Edad aprox.: " + edad + " años");

        scanner.close();
    }
}