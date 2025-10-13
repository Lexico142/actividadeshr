import java.util.Scanner;

public class AtrapaPokemon {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int vida = src.nextInt();
        int vidaMax = src.nextInt();
        String estado = src.next();
        String pokeball = src.next();

        System.out.println((vida == vidaMax/2 && estado.equalsIgnoreCase("dormido") || estado.equalsIgnoreCase("paralizado")) || pokeball.equalsIgnoreCase("masterball"));
    }
}
