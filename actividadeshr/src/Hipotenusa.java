import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        float b = src.nextFloat();

        float res = (float) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println(res);

    }

}
