import java.util.Scanner;

public class FiltrarVocales {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        for (int i = 0; i < a; i++) {

            String b = src.next();

            if (b.equals("a") || b.equals("e") || b.equals("i") || b.equals("o") || b.equals("u")) System.out.println(b);


        }
    }
}
