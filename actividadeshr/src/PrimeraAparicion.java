import java.util.Scanner;

public class PrimeraAparicion {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String a = src.nextLine();
        char b = src.next().charAt(0);

        int c = a.indexOf(b);

        System.out.println(c);
    }
}
