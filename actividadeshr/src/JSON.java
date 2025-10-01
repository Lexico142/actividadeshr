import java.util.Scanner;

public class JSON {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        String nombre = src.next();
        int edad = src.nextInt();
        String mail = src.next();
        boolean activo = src.nextBoolean();

        System.out.println("{");
        System.out.println("  \"nombre\": \"" + nombre + "\",");
        System.out.println("  \"edad\": " + edad + "," );
        System.out.println("  \"email\": \"" + mail + "\"," );
        System.out.println("  \"activo\": " + activo);
        System.out.println("}");
    }
}
