import java.util.Locale;
import java.util.Scanner;

public class TipoCorrecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int y = 2020;
        String m = "Abril";
        float t = 37.5f;
        boolean s = false;
        char c = ';';

        System.out.println(y);
        System.out.println(m);
        System.out.println(t);
        System.out.println(s);
        System.out.println(c);
    }
}