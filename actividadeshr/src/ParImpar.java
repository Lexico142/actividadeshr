import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int num = src.nextInt();

        if (num % 2 == 0) System.out.println("El numero " + num + " es par");
        else System.out.println("El numero " + num + " es impar");

    }
}
