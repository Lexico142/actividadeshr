import java.util.Scanner;

public class BuclePares {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int limite = src.nextInt();
        int total = 0;
        for (int i = 0; i < limite ; i++) {
            
            int a = src.nextInt();
            if (a % 2 == 0) {
                System.out.println(a);
                total = total + a;
            }
        }
        System.out.println("Suma: " + total);

    }
}
