package hackerrank;

import java.util.Scanner;

public class Urinales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        char[] a = new char[len];

        for (int i = 0; i < len; i++) {
            a[i] = sc.next().charAt(0);
        }

        int b = sc.nextInt();

        boolean aa = (a[b] == 'O');
        if (b > 0 && a[b-1] == 'X') aa = false;
        if (b < len-1 && a[b+1] == 'X') aa = false;

        if (aa) System.out.println("Disponible");
        else System.out.println("No disponible");

        for (int i = 0; i < len; i++) {
            if (a[i] == 'O') {
                boolean libre = true;
                if (i > 0 && a[i-1] == 'X') libre = false;
                if (i < len-1 && a[i+1] == 'X') libre = false;

                if (libre) System.out.println(i);
            }
        }
    }
}