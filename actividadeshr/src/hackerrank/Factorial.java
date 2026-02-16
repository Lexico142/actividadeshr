package hackerrank;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        System.out.println(factorial(a));
    }

    static int factorial(int a) {
        int total = 1;
        if (a == 1) return total;
        else {
            total = a * factorial(a - 1);
            return total;
        }
    }
}
