import java.util.Scanner;

public class calcularBinario {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n1 = src.nextInt() * 128;
        int n2 = src.nextInt() * 64;
        int n3 = src.nextInt() * 32;
        int n4 = src.nextInt() * 16;
        int n5 = src.nextInt() * 8;
        int n6 = src.nextInt() * 4;
        int n7 = src.nextInt() * 2;
        int n8 = src.nextInt();

        int numeroFinal = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
        System.out.println(numeroFinal);



    }
}
