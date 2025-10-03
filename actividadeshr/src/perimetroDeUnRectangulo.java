import java.util.Scanner;

public class perimetroDeUnRectangulo {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int x1 = src.nextInt();
        int y1 = src.nextInt();
        int x2 = src.nextInt();
        int y2 = src.nextInt();

        int base = (x1 - x2);
        int altura = (y1 - y2);

        int perimetro = 2 * (base + altura);

        System.out.println(perimetro);


    }
}