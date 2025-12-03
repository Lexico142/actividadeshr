import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int limite = src.nextInt();

        int a = 0;
        int b = 1;
        int aa;

        for (int i = 0; i < limite; i++) {

            aa = a + b;
            a = b;
            b = aa;

        }

        System.out.println(a);
    }
}
