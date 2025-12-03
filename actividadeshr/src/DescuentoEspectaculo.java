import java.util.Scanner;

public class DescuentoEspectaculo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int precioBase = src.nextInt();
        int edad = src.nextInt();
        int dia = src.nextInt();
        boolean tieneCupon = src.nextBoolean();

        float total = precioBase;

        if (tieneCupon) total = precioBase - ((float) (precioBase * 30) / 100);
        else if (edad <= 6) total = 0;
        else if (edad <= 18) total = precioBase - ((float) (precioBase * 10) / 100);
        else if (edad >= 65) total = precioBase - ((float) (precioBase * 15) / 100);

        if (dia == 3) total = precioBase - ((float) (precioBase * 25) / 100);
        if (dia == 6 | dia == 7) total = (float) (precioBase * 1.05);

        System.out.println(total);


    }
}
