import java.util.Scanner;

public class MayorEdadCondicionales {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String nom = src.nextLine();

        if (src.nextInt() >= 18) System.out.println(nom + " es mayor de edad");
        else System.out.println(nom + " no es mayor de edad");

    }
}
