import java.util.Scanner;

public class DosReinas {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int x1 = src.nextInt();
        int y1 = src.nextInt();
        int x2 = src.nextInt();
        int y2 = src.nextInt();

        int diagonal1 = Math.abs(x1 - x2);
        int diagonal2 = Math.abs(y1 - y2);

        boolean parDiagonal = diagonal1 == diagonal2;

        System.out.println(parDiagonal || x1 == x2 || y1 == y2);
    }
}
