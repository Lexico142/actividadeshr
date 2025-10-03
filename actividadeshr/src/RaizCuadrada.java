import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float n1 = src.nextFloat();

        float total = (float) Math.sqrt(n1);

        System.out.println(total);
    }
}
