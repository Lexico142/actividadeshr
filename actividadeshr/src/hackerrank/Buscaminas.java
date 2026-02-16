package hackerrank;

import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int filas = src.nextInt();
        int columnas = src.nextInt();


        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = src.nextInt();
            }
        }


        while(true){
            int comprobarFila = src.nextInt() - 1;
            int comprobarColumna = src.nextInt() - 1;
            if (comprobarFila == -1 && comprobarColumna == -1) break;
            if (matriz[comprobarFila][comprobarColumna] == 1) System.out.println("SI");
            else System.out.println("NO");
        }


    }
}