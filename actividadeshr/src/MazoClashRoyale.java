import java.util.Scanner;

public class MazoClashRoyale {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int[] a = new int[8];
        int totalElixir = 0;
        float media = 0;


        for (int i = 0; i < 8; i++) {

            a[i] = src.nextInt();

        }

        System.out.println("--- Mazo de Clash Royale ---");


        for (int i = 0; i < 8; i++) {

            System.out.println("Carta " + (i + 1) + ": " + a[i] + " elixir");
            totalElixir += a[i];
            
        }

        media = (float) totalElixir /8;

        System.out.println("\nCoste medio del mazo: " + media + " elixir");


    }
}
