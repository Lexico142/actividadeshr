import java.util.Scanner;

public class EnmarcarFotos {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int x2 = src.nextInt();
        int y = src.nextInt();
        int y2 = src.nextInt();

        int a = src.nextInt();
        int a2 = src.nextInt();
        int b = src.nextInt();
        int b2 = src.nextInt();


        boolean coord = Math.abs(x - x2) == Math.abs(a - a2);
        boolean coord2 = Math.abs(y - y2) == Math.abs(b - b2);

        System.out.println(coord == coord2);
    }
}
