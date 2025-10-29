import java.util.Scanner;

public class Terminacion {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String palabra = src.nextLine();

        char a = src.next().charAt(0);

        System.out.println(a == palabra.charAt(3));
    }
}
