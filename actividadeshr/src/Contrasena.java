import java.util.Objects;
import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();
        String b = src.nextLine();
        String c = src.nextLine();

        System.out.println(a.equalsIgnoreCase("verde") && !b.equals("rojo") && (c.equalsIgnoreCase("azul") || c.equalsIgnoreCase("negro")));
    }
}
