import java.util.Scanner;

public class Equilatero {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();

        System.out.println(a == b && b == c);
    }
}
