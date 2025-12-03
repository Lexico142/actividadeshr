import java.util.Scanner;

public class PrimeroIgualUltimo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int numero;
        int primerNumero = 0;
        int ultimo = 0;
        boolean esPrimero = true;

        while (true) {
            numero = src.nextInt();

            if (numero == 0) {
                break;
            }

            if (esPrimero) {
                primerNumero = numero;
                esPrimero = false;
            }

            ultimo = numero;
        }

        if (primerNumero == ultimo) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
