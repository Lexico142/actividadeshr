import java.util.Scanner;
public class caramelosEnElFrasco {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int altura = src.nextInt();
        int ancho = src.nextInt();
        int profundidad = src.nextInt();
        int caramelo = src.nextInt();

        int total = (altura * ancho * profundidad) / caramelo;

        System.out.println(total);
    }
}
