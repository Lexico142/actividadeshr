import java.util.Scanner;

public class ControllCalidad {
    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);

        boolean a = src.nextBoolean();
        boolean b = src.nextBoolean();
        boolean c = src.nextBoolean();
        boolean d = src.nextBoolean();
        boolean e = src.nextBoolean();

        if (a) System.out.println("El estado del chasis es: correcto");
        else System.out.println("El estado del chasis es: defectuoso");
        if (b) System.out.println("El estado de las ruedas es: correcto");
        else System.out.println("El estado de las ruedas es: defectuoso");
        if (c) System.out.println("El estado del motor es: correcto");
        else System.out.println("El estado del motor es: defectuoso");
        if (d) System.out.println("El estado de la electronica es: correcto");
        else System.out.println("El estado de la electronica es: defectuoso");
        if (e) System.out.println("El estado de las luces es: correcto");
        else System.out.println("El estado de las luces es: defectuoso");
        if (a && b && c && d && e) System.out.println("El estado general del coche es: correcto");
        else System.out.println("El estado general del coche es: defectuoso");
    }
}
