import java.util.Scanner;

public class ClasificadorTriangulos {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();

        boolean equilatero = (a == b) && (b == c);
        boolean isosceles = (a == b) || (b == c) || (a == c);
        boolean escaleno = (a != b) && (b != c) && (a != c);


        System.out.println("Equilatero: " + equilatero);
        System.out.println("Isosceles: " + isosceles);
        System.out.println("Escaleno: " + escaleno);
    }
}
