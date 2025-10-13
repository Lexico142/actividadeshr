import java.util.Scanner;

public class Luces {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        boolean a = src.nextBoolean();
        boolean b = src.nextBoolean();
        boolean c = src.nextBoolean();
        boolean d = src.nextBoolean();

        System.out.println(a == b == c == d);

    }
}
