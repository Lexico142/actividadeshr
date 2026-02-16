import java.util.Scanner;

public class tests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (matriz[a][b] == 2){
            System.out.println("SUPER EFFECTIVE");
        } else if (matriz[a][b] == 1){
            System.out.println("NORMAL");
        } else {
            System.out.println("NO EFFECT");
        }

    }
}
