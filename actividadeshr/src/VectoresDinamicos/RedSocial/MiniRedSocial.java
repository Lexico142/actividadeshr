package VectoresDinamicos.RedSocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniRedSocial {
    public static void main(String[] args) {

        HashMap<String, Usuario> usuarios = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

        Usuario u1 = new Usuario("ana@correo.com", "1234");
        u1.agregarPublicacion("Hola, soy Ana!");
        u1.agregarPublicacion("Hoy hace muy buen día.");
        usuarios.put(u1.getCorreo(), u1);

        Usuario u2 = new Usuario("juan@correo.com", "abcd");
        u2.agregarPublicacion("Mi primera publicación.");
        usuarios.put(u2.getCorreo(), u2);

        int opcion = 0;
        while (opcion != 2) {
            System.out.println("\n=== MINI RED SOCIAL ===");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Correo electrónico: ");
                    String correo = teclado.nextLine();

                    System.out.print("Contraseña: ");
                    String contrasena = teclado.nextLine();

                    if (usuarios.containsKey(correo) && usuarios.get(correo).getContrasena().equals(contrasena)) {

                        System.out.println("\nSesión iniciada correctamente. Bienvenido/a, " + correo);

                        System.out.println("\n=== PUBLICACIONES DE TODOS LOS USUARIOS ===");
                        for (Map.Entry<String, Usuario> entrada : usuarios.entrySet()) {
                            System.out.println("\nUsuario: " + entrada.getKey());
                            ArrayList<String> posts = entrada.getValue().getPublicaciones();
                            if (posts.isEmpty()) {
                                System.out.println("  (Sin publicaciones)");
                            } else {
                                for (String post : posts) {
                                    System.out.println("  - " + post);
                                }
                            }
                        }
                    } else {
                        System.out.println("Correo o contraseña incorrectos.");
                    }
                    break;

                case 2:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}