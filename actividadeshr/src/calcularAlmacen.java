import java.util.Scanner;

public class calcularAlmacen {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int c = src.nextInt();

        System.out.println(n / c + " " +  n % c);
    }
}
