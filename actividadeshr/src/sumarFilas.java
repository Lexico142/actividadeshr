import java.util.Scanner;

public class sumarFilas {
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

        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;

            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println(sumaFila);
        }
    }
}