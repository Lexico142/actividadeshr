package hackerrank;

import java.util.Scanner;

public class MatrizUnosCeros {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int filas = src.nextInt();
        int columnas = src.nextInt();
        int unos = 0;
        int ceros = 0;

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = src.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {


            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 0) ceros++;
                else unos++;
            }
        }
        System.out.println(ceros + " " + unos);
    }
}