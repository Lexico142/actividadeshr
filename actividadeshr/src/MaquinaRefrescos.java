import java.util.Scanner;

public class MaquinaRefrescos {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        float b = src.nextFloat();
        String c = src.next();
        int d = src.nextInt();

        boolean fanta = c.equalsIgnoreCase("fanta");
        boolean cocacola = c.equalsIgnoreCase("cocacola");

        System.out.println(a >= b && (fanta || cocacola) && d > 50);

    }
}
