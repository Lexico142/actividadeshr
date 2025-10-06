import java.util.Scanner;

public class XML {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);


        String nom = src.nextLine();
        String edad = src.nextLine();
        String ciudad = src.nextLine();

        System.out.println("<?xml version=1.0 encoding=UTF-8?>");
        System.out.println("\n");
        System.out.println("<persona>");
        System.out.println("<nombre>" + nom +"</nombre>");
        System.out.println("<edad>" + edad +"</edad>");
        System.out.println("<ciudad>" + ciudad + "</ciudad>");
        System.out.println("</persona>");
    }
}
