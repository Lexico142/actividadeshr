import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String palabra = src.nextLine();

        System.out.println(palabra.charAt(3) + "" + palabra.charAt(2) + "" + palabra.charAt(1) + "" + palabra.charAt(0));

    }
}