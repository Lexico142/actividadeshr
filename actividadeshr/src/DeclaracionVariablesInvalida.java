import java.util.Locale;
import java.util.Scanner;

public class DeclaracionVariablesInvalida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int a = 512343;
        int b = 3431231;

        System.out.println(a + b);
    }
}