import java.util.Scanner;

public class MontanaRusa {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int edad = src.nextInt();
        int altura = src.nextInt();

        System.out.println(edad >= 12 && altura >= 140);
    }
}
