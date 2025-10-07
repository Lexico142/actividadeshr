import java.util.Scanner;

public class PartidoFutbol {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int gol = src.nextInt();
        int gol2 = src.nextInt();
        int rojas = src.nextInt();
        int rojas2 = src.nextInt();

        System.out.println(gol > gol2 || rojas < rojas2);
    }
}