import java.util.Scanner;

public class ConcatenarPalabras {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();

        char b = a.charAt(0);
        char c = a.charAt(1);

        System.out.println(String.valueOf(b).concat(String.valueOf(c)));

    }
}
