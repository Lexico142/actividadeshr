import java.util.Scanner;

public class TiroArco {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int b = src.nextInt();
        int c = a + b;

        if (c <= 5) System.out.println(5);
        else if (c <= 10) System.out.println(4);
        else if (c <= 15) System.out.println(3);
        else if (c <= 20) System.out.println(2);
        else if (c <= 25) System.out.println(1);
        else System.out.println(0);

    }
}
