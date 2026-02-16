package hackerrank;

import java.util.Scanner;

public class maquinaExpendedoraMetodos {
    public static Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] productos = {
                {5, 3, 0},
                {2, 0, 1},
                {0, 4, 6}
        };
        if (hayStock(productos)){
            System.out.println("Producto disponible");
        } else {
            System.out.println("Producto agotado");
        }
    }

    public static boolean hayStock(int[][] productos) {
        int fila = src.nextInt();
        int columna = src.nextInt();
        return productos[fila][columna] > 0;
    }
}
