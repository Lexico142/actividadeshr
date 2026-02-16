package hackerrank;

import java.util.Scanner;

public class Laberinto {
    static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int len = src.nextInt();
        char[][] a = new char[len][len];
        esValida(a, 0, 0);
    }

    static boolean esValida(char[][] a, int x, int y) {
        if (x < 0 || x >= a.length || y < 0 || y >= a[0].length) return false;
        if (a[x][y] == '#') return false;
        return true;
    }
}
