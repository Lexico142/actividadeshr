import java.util.Scanner;

public class CaracterPosicionX {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();
        int b = src.nextInt();

        char c = a.charAt(b);

        System.out.println(c);
    }
}
