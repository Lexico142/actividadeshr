import java.util.Scanner;

public class SalaVIP {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        boolean b = src.nextBoolean();
        String c = src.next();
        boolean d = src.nextBoolean();

        System.out.println(a >= 18 && b == true && c.equalsIgnoreCase("elegante") || d == true);
    }
}
