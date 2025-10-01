import java.util.Scanner;

public class calcularDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int d = sc.nextInt();

        int precioFinal = p - (p * d / 100);

        System.out.println(precioFinal);

    }
}
