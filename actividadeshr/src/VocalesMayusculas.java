import java.util.Scanner;

public class VocalesMayusculas {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String texto = src.nextLine();

        System.out.println(texto.replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U'));

    }
}
