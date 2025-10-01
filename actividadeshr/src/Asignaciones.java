import java.util.Locale;
import java.util.Scanner;

public class Asignaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int a = 3;
        int b = 5;
        int c = 4;

        System.out.println(a + " " + b + " " + c);
    }
}