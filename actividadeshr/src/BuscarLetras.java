import java.util.Scanner;

public class BuscarLetras {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);


        char z = src.next().charAt(0);
        src.nextLine();
        String a = src.nextLine();
        char[] b = a.toCharArray();
        int contador = 0;

        for (int i = 0; i < a.length(); i++) {

            if (b[i] == z) contador++;

        }
        System.out.println(contador);
    }
}
