import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int num1 = src.nextInt();
        int num2 = src.nextInt();
        int num3 = src.nextInt();
        int num4 = src.nextInt();
        int num5 = src.nextInt();
        int num6 = src.nextInt();

        char a = (char) num1;
        char b = (char) num2;
        char c = (char) num3;
        char d = (char) num4;
        char e = (char) num5;
        char f = (char) num6;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        System.out.print(f);

    }
}
