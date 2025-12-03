import java.util.Scanner;

public class PrecioFerrocarril {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        int b = src.nextInt();

        float precio = (float) (a * 0.35);

        if (b > 7 && a > 800) precio = precio / 30 * 100;

        System.out.println(precio);

    }
}
