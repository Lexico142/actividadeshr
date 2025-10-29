import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();
        String b = a.trim();

        System.out.println(b);
    }
}
