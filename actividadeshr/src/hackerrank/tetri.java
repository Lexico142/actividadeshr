package hackerrank;

import java.util.Scanner;

public class tetri {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int filas = src.nextInt();
        int columnas = src.nextInt();


        int[][] matriz = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = src.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            int primer = matriz[0][i];
            for (int j = 0; j < columnas ; j++) {
                if (primer == matriz[i][j]){

                }
            }
        }


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();

        }

    }
}