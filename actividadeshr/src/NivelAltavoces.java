import java.util.Scanner;

public class NivelAltavoces {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        boolean c = src.nextBoolean();

        if (c == true){
            b *= 2;
        }
        System.out.println(a > b);
    }
}
