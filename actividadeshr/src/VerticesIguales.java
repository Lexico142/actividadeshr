import java.util.Scanner;

public class VerticesIguales {
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
        boolean a = false;

        for (int j = 0; j < columnas; j++) {
            boolean igual = true;
            int primer = matriz[0][j];
            for (int i = 1; i < filas; i++) {
                if (matriz[i][j] != primer) {
                    igual = false;
                    break;
                }
            }
            if (igual) {
                System.out.println("La columna " + j + " te tots els numeros iguals.");
                a = true;
                break;
            }
        }

        if (!a) {
            System.out.println("No hi ha cap columna amb els numeros iguals.");
        }
    }
}