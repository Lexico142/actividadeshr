import java.util.Scanner;

public class CuentaNumeros {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int contador = 0;
        int n;

        do {
            n = src.nextInt();
            if (n != 0) contador++;

        } while (n != 0);

        System.out.println(contador);
    }
}
