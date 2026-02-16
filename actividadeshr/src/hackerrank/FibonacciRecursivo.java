package hackerrank;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        System.out.println(fibonacci(a));
    }

    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
