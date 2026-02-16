package hackerrank;

import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int b = src.nextInt();
        System.out.println(potencia(a, b));

    }

    static int potencia(int a, int b) {
        if (b == 0) return 1;
        return a * potencia(a, b - 1);
    }

}
