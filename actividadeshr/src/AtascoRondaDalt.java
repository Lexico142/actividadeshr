import java.util.Scanner;

public class AtascoRondaDalt {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();

        int c = a / b;

        if (c > 625) System.out.println("Embudo extremo");
        else if (c > 575) System.out.println("Embudo alto");
        else if (c > 425) System.out.println("Embudo moderado");
        else if (c > 375) System.out.println("Embudo bajo");
        else System.out.println("No hay embudo");
    }
}
