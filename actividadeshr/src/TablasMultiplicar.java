import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int total = 0;

        System.out.println("Tabla del " + a);

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < 11; j++) {
                total = j * a;
                System.out.println(a + " x " + j + " = " + total);
            }
        }
    }
}
