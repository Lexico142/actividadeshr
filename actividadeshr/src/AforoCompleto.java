import java.util.Scanner;

public class AforoCompleto {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        boolean c = src.nextBoolean();

        boolean res = a < b && c == true;
        System.out.println(res);
    }
}
