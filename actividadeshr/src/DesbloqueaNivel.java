import java.util.Scanner;

public class DesbloqueaNivel {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int puntos = src.nextInt();
        int matches = src.nextInt();

        System.out.println(puntos >= 1000 || matches >= 50);
    }
}
