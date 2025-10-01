import java.util.Scanner;
public class stigidSert {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int radio = src.nextInt();
        final float pi = 3.1416f;

        float camino = radio * 2 * pi;


        System.out.println((int)(camino));

    }
}
