import java.util.Scanner;

public class ContratarDesarrollador {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        String nombre = src.next();
        int edad = src.nextInt();
        String estudios = src.next();
        int exp = src.nextInt();
        String len = src.next();

        System.out.println("El formulario de "+ nombre + " se ha completado. Te contactaremos si necesitamos un programador de " + len + ".");

    }
}