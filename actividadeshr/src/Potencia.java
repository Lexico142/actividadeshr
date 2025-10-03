import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float n1 = src.nextFloat();
        float n2 = src.nextFloat();

        float total = (float) Math.pow(n1,n2);

        System.out.println(total);
    }
}
