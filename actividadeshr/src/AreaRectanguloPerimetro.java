import java.util.Scanner;

public class AreaRectanguloPerimetro {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        float b = src.nextFloat();

        float x = a * b;
        float y = a*2 + b*2;

        System.out.println("Area: " + x);
        System.out.println("Perimetro: " + y);


    }
}
