import java.util.Scanner;

public class FormarPalabras {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();

        char b = a.charAt(src.nextInt());
        char c = a.charAt(src.nextInt());
        char d = a.charAt(src.nextInt());
        char e = a.charAt(src.nextInt());
        char f = a.charAt(src.nextInt());
        char g = a.charAt(src.nextInt());

        System.out.println(b + "" + c + "" + d + "" + e + "" + f + "" + g);


    }
}
