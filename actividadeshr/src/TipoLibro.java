import java.util.Scanner;

public class TipoLibro {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int len = src.nextInt();
        String[] a = new String[len];
        int[] b = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = src.next();
        }

        for (int i = 0; i < len; i++) {
            b[i] = src.nextInt();
        }

        int min = b[0];
        for (int i = 1; i < len; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }

        System.out.println("el listado de libros que menos tenemos son:");

        for (int i = 0; i < len; i++) {
            if (b[i] == min) {
                System.out.println(a[i] + " " + min);
            }
        }
    }
}