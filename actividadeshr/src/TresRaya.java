import java.util.Scanner;

public class TresRaya {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n1 = src.nextInt();
        int n2 = src.nextInt();
        int n3 = src.nextInt();
        int n4 = src.nextInt();
        int n5 = src.nextInt();
        int n6 = src.nextInt();
        int n7 = src.nextInt();
        int n8 = src.nextInt();
        int n9 = src.nextInt();

        if (n1 + n2 + n3 == 3 && (n1 == n2 && n2 == n3)) System.out.println("Jugador1");
        else if (n1 + n2 + n3 == 6 && (n1 == n2 && n2 == n3)) System.out.println("Jugador2");
        else if (n4 + n5 + n6 == 3  && (n4 == n5 && n5 == n6)) System.out.println("Jugador1");
        else if (n4 + n5 + n6 == 6 && (n4 == n5 && n5 == n6)) System.out.println("Jugador2");
        else if (n7 + n8 + n9 == 3 && (n7 == n8 && n8 == n9)) System.out.println("Jugador1");
        else if (n7 + n8 + n9 == 6 && (n7 == n8 && n8 == n9)) System.out.println("Jugador2");
        else if (n1 + n4 + n7 == 3 && (n1 == n4 && n4 == n7)) System.out.println("Jugador1");
        else if (n1 + n4 + n7 == 6 && (n1 == n4 && n4 == n7)) System.out.println("Jugador2");
        else if (n2 + n5 + n8 == 3 && (n2 == n5 && n5 == n8)) System.out.println("Jugador1");
        else if (n2 + n5 + n8 == 6 && (n2 == n5 && n5 == n8)) System.out.println("Jugador2");
        else if (n3 + n6 + n9 == 3 && (n3 == n6 && n6 == n9)) System.out.println("Jugador1");
        else if (n3 + n6 + n9 == 6 && (n3 == n6 && n6 == n9) ) System.out.println("Jugador2");
        else if (n1 + n5 + n9 == 3 && (n1 == n5 && n9 == n5)) System.out.println("Jugador1");
        else if (n1 + n5 + n9 == 6 && (n1 == n5 && n9 == n5)) System.out.println("Jugador2");
        else if (n3 + n5 + n7 == 3 && (n3 == n5 && n5 == n7)) System.out.println("Jugador1");
        else if (n3 + n5 + n7 == 6 && (n3 == n5 && n5 == n7)) System.out.println("Jugador2");
        else System.out.println("Empate");


    }
}
