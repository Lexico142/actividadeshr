import java.util.Scanner;

public class SalarioMensualRedondeado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioAnual = sc.nextDouble();
        double mensual = salarioAnual / 12;
        int resultado = (int) mensual;
        System.out.println(resultado);
    }
}