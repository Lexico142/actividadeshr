import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        int b = src.nextInt();

        for (int i = 0; i < b; i++) {

            float puente = src.nextFloat();

            if (a > puente){

                System.out.println("choca con el puente " + (i + 1));
                break;

            }

        }

    }
}
