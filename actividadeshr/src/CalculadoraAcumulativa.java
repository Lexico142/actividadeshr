import java.util.Scanner;

public class CalculadoraAcumulativa {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float res = 0;
        int turnos = 0;

        while (true) {
            String entrada = src.next();

            if (entrada.equals("END") && turnos == 0) {
                System.out.println(0.0);
                break;
            }

            if (entrada.equals("END")) {
                break;
            }

            char operador = entrada.charAt(0);
            float numero = src.nextFloat();

            switch(operador){
                case '+':
                    res = res + numero;
                    break;
                case '-':
                    res = res - numero;
                    break;
                case '*':
                    res = res * numero;
                    break;
                case '/':
                    res = res / numero;
                    break;
            }

            System.out.println(res);
            turnos++;

        }

    }
}