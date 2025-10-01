import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int amigos = src.nextInt();
        int porciones = 2 * amigos + 1;

        System.out.println(porciones);

    }
}
