package hackerrank;

import java.util.Scanner;

public class Bomberman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        int[][] tablero = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }

        int idBomba = scanner.nextInt();

        int filaBomba = -1;
        int colBomba = -1;

        boolean encontrado = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] == idBomba) {
                    filaBomba = i;
                    colBomba = j;
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }



        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == filaBomba || j == colBomba) {
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }
            }

        }
    }
}