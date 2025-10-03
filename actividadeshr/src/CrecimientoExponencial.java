import java.util.Scanner;

public class CrecimientoExponencial {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        float b = src.nextFloat();
        float c = src.nextFloat();

        float res = (float) (a * Math.exp(b*c));

        System.out.println(res);

    }

}
