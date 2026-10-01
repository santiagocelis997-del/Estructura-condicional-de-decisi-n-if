import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en Bolívares: ");
        int monto = scanner.nextInt();

        System.out.println("Desglose de billetes:");

        if (monto / 50000 > 0) { System.out.println(monto / 50000 + " billete(s) de 50000"); monto %= 50000; }
        if (monto / 20000 > 0) { System.out.println(monto / 20000 + " billete(s) de 20000"); monto %= 20000; }
        if (monto / 10000 > 0) { System.out.println(monto / 10000 + " billete(s) de 10000"); monto %= 10000; }
        if (monto / 5000 > 0)  { System.out.println(monto / 5000  + " billete(s) de 5000");  monto %= 5000;  }
        if (monto / 2000 > 0)  { System.out.println(monto / 2000  + " billete(s) de 2000");  monto %= 2000;  }
        if (monto / 1000 > 0)  { System.out.println(monto / 1000  + " billete(s) de 1000");  monto %= 1000;  }
        if (monto / 500 > 0)   { System.out.println(monto / 500   + " billete(s) de 500");   monto %= 500;   }
        if (monto / 100 > 0)   { System.out.println(monto / 100   + " billete(s) de 100");   monto %= 100;   }
        if (monto / 50 > 0)    { System.out.println(monto / 50    + " billete(s) de 50");    monto %= 50;    }
        if (monto / 20 > 0)    { System.out.println(monto / 20    + " billete(s) de 20");    monto %= 20;    }
        if (monto / 10 > 0)    { System.out.println(monto / 10    + " billete(s) de 10");    monto %= 10;    }

        if (monto > 0) {
            System.out.println("Sobrante en monedas/fracción no desglosable: " + monto);
        }

        scanner.close();
    }
}