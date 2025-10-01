import java.util.Scanner;
public class diferenciaEscalonada {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int n = src.nextInt();

        int x = (n * n) - ((n - 1) * 2);

        System.out.println(x);
    }
}
