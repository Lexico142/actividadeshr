import java.util.Scanner;

public class SubdividirPalabra {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();
        String b = a.substring(0,3);
        String c = a.substring(1,2);
        String d = a.substring(1,4);
        String e = a.substring(5,6);

        System.out.println(b + c + d + e);

    }
}
