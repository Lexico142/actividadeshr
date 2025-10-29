import java.util.Scanner;

public class EncuestaFrameworks {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Bienvenido a la encuesta.");
        System.out.println("Conoces algun framework?");
        String res = src.nextLine();
        if (res.equalsIgnoreCase("si")){
            System.out.println("Cual?");
            String res2 = src.nextLine();
            System.out.println("Se ha registrado la respuesta: " + res2);
        }
        System.out.println("Gracias por contestar");
    }
}
