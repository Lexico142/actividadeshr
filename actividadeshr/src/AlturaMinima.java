import java.util.Scanner;

public class AlturaMinima {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int len = src.nextInt();
        float[] a = new float[len];

        for (int i = 0; i < len ; i++) {
            a[i] = src.nextFloat();
        }

        float maximo = src.nextFloat();

        for (int i = 0; i < len; i++) {
            if (a[i] >= maximo) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
