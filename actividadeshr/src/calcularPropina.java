import java.util.Scanner;

public class calcularPropina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cuenta = sc.nextInt();
        int canPropina = sc.nextInt();

        int numPropina =  cuenta * canPropina / 100;
        int total = numPropina + cuenta;
        System.out.println(numPropina + " " + total);

    }
}
