package hackerrank;

import java.util.Scanner;

public class parImparMetodos {
    public static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        esPar();
    }

    static void esPar() {
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
