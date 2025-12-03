import java.util.Scanner;

public class OrdenCola {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int len = src.nextInt();
        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = src.nextInt();
        }

        for (int i = 0; i < len; i++) {
            int personasAdelantadas = 0;

            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[i]) {
                    personasAdelantadas++;
                }
            }

            if (personasAdelantadas > 0) {
                System.out.println("La persona con el ticket " + a[i] + " se ha colado por delante de " + personasAdelantadas + " personas.");
            }
        }
    }
}