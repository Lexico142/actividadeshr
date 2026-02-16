package hackerrank;

import java.util.Scanner;

public class validadorContrasenaMetodos {
    public static Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        String contrasena1 = src.nextLine();
        String contrasena2 = src.nextLine();

        if (validarContrasena(contrasena1, contrasena2)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }

    public static boolean validarContrasena(String contrasena1, String contrasena2) {
        return contrasena1.equals(contrasena2);
    }




}
