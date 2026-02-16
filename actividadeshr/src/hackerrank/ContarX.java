package hackerrank;

import java.util.Scanner;

public class ContarX {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        contarX(num);
    }

    static void contarX(int num) {
        if (num == 0) {
            return;
        } else {
            contarX(num - 1);
            System.out.print(num + " ");
        }

    }
}
