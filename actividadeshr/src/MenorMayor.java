import java.util.Scanner;

public class MenorMayor {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();

        boolean mayor = a < b && b < c;

        System.out.println(mayor);

    }
}
