import java.util.Scanner;

public class Distancia3D {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float x1 = src.nextFloat();
        float y1 = src.nextFloat();
        float z1 = src.nextFloat();
        float x2 = src.nextFloat();
        float y2 = src.nextFloat();
        float z2 = src.nextFloat();

        float x3 = x2 - x1;
        float y3 = y2 - y1;
        float z3 = z2 - z1;

        float distancia = (float) Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2) + Math.pow(z3, 2));

        System.out.println(distancia);

    }

}
