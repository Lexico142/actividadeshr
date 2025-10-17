import java.util.Scanner;

public class Bolos {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();

        int total = a + b;
        boolean pleno = (total == 10);

        System.out.println("Pleno/semipleno: " + pleno);
        System.out.println("Bolos derribados: " + total);
    }
}
