package hackerrank;

import java.util.Scanner;

public class SumaDosNumerosMetodos {
    public static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumar(a, b));
    }
    static int sumar(int a, int b) {
        return a + b;
    }
}
