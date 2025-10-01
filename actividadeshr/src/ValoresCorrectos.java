import java.util.Locale;
import java.util.Scanner;

public class ValoresCorrectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        // asigna els valors a aquestes variables

        boolean a = true;
        float b = 35.6f;
        float c = 2000.0f;
        String d = "true";
        char e1 = 't', e2 = 'r', e3 = 'u', e4 = 'e';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.print(e1);
        System.out.print(e2);
        System.out.print(e3);
        System.out.print(e4);
    }
}