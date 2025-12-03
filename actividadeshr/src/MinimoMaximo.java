import java.util.Scanner;

public class MinimoMaximo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int posicionMin = 1;
        int posicionMax = 1;

        int a = src.nextInt();

        min = a;
        max = a;

        for (int i = 2; i <= 5; i++) {
            a = src.nextInt();

            if (a < min) {
                min = a;
                posicionMin = i;
            }
            if (a > max) {
                max = a;
                posicionMax = i;
            }
        }

        System.out.println("El numero minimo es " + min + " y se encuentra en la posicion " + posicionMin);
        System.out.println("El numero maximo es " + max + " y se encuentra en la posicion " + posicionMax);
    }
}
