import java.util.Locale;
import java.util.Scanner;

public class NombresCorrectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String feature = "Text Blocks";
        String language = "Java";
        char quote = '"';
        int version = 15;

        System.out.print(language);
        System.out.print(" ");
        System.out.print(version);
        System.out.print(" incorpora ");
        System.out.print(feature);
        System.out.print(", que es delimiten amb ");
        System.out.print(quote);
        System.out.print(quote);
        System.out.print(quote);
    }
}