import java.util.Scanner;

public class DesgloseMonedas {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        src.close();

        int moneda500 = a / 500;
        a = a % 500;
        int moneda100 = a / 100;
        a = a % 100;
        int moneda50 = a / 50;
        a = a % 50;
        int moneda5 = a / 5;
        a = a % 5;
        int moneda1 = a;

        if (moneda500 > 0) {
            if (moneda500 == 1) System.out.println("1 moneda de 500");
            else System.out.println(moneda500 + " monedas de 500");
        }

        if (moneda100 > 0) {
            if (moneda100 == 1) System.out.println("1 moneda de 100");
            else System.out.println(moneda100 + " monedas de 100");
        }

        if (moneda50 > 0) {
            if (moneda50 == 1) System.out.println("1 moneda de 50");
            else System.out.println(moneda50 + " monedas de 50");
        }

        if (moneda5 > 0) {
            if (moneda5 == 1) System.out.println("1 moneda de 5");
            else System.out.println(moneda5 + " monedas de 5");
        }

        if (moneda1 > 0) {
            if (moneda1 == 1) System.out.println("1 moneda de 1");
            else System.out.println(moneda1 + " monedas de 1");
        }
        src.close();
    }
}
