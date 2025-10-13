import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();
        String b = src.nextLine();

        System.out.println(a.equalsIgnoreCase("Admin123") && b.equalsIgnoreCase("sudopsswd"));
    }
}
