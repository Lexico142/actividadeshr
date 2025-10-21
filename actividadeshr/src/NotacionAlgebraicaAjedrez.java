import java.util.Scanner;

public class NotacionAlgebraicaAjedrez {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int c = src.nextInt();
        int f = src.nextInt();

        int cc = c + 96;

        char res = (char) cc;

        System.out.print(res);
        System.out.println(f);

    }
}
