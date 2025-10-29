import java.util.Scanner;

public class Balatro {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();


        if ( (a + 1 == b && b + 1 == c) || (a + 1 == c && c + 1 == b) || (b + 1 == a && a + 1 == c) || (b + 1 == c && c + 1 == a) || (c + 1 == a && a + 1 == b) || (c + 1 == b && b + 1 == a) ) System.out.println("STRAIGHT");
        else if ((a == b || b == c || c == a) && a != c) System.out.println("PAIR");
        else if (a == b && b == c && c == a) System.out.println("THREE OF A KIND");
        else if (a != b && b != c) System.out.println("HIGH CARD");

    }
}
