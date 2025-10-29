import java.util.Scanner;

public class HoraApertura {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.next();

        if (a.equals("Sabado") || a.equals("Domingo"))System.out.println("10:00");
        else System.out.println("8:00");
    }
}
