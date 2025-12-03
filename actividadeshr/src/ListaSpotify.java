import java.util.Scanner;

public class ListaSpotify {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int len = src.nextInt();
        src.nextLine();

        String[] b = new String[len];
        String[] c = new String[len];

        for (int i = 0; i < len; i++) {
            b [i] = src.nextLine();
            c [i] = src.nextLine();
        }

        System.out.println("--- Lista de Spotify ---");

        for (int i = 0; i < len; i++) {
            System.out.println("Cancion " + (i + 1) + ": " + b[i] +  " - " + c[i] +  " min");
        }


    }
}
