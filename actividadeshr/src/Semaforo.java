import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();

        System.out.println(a == 0 && b == 1);
    }
}
