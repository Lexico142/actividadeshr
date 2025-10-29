import java.util.Scanner;

public class SobranHuevos {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int huevos = src.nextInt();
        int hueveras = 0;
        int huevosRestantes = 0;

        if (huevos % 24 == 0) {
            hueveras = huevos / 24;
        } else {
            hueveras = (huevos / 24) + 1;
            huevosRestantes = 24 - (huevos % 24);
        }
        System.out.print(hueveras);
        System.out.println(" " + huevosRestantes);

    }
}
