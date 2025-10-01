import java.util.Scanner;

public class SalidaDeAutobus {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int bus = src.nextInt();
        int bus1 = src.nextInt();
        int pasajeros = src.nextInt();

        int total = (bus + bus1) * pasajeros;

        System.out.println(total);

    }
}
