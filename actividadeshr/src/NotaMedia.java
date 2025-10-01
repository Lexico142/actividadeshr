import java.util.Scanner;

public class NotaMedia {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        float nota = src.nextFloat();
        float nota2 = src.nextFloat();
        float nota3 = src.nextFloat();

        float media = (nota + nota2 + nota3) / 3;

        System.out.println(media);

    }
}
