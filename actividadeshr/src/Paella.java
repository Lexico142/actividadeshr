import java.util.Scanner;

public class Paella {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int comensales = src.nextInt();
        float kiloArroz = src.nextFloat();
        float kiloGambas = src.nextFloat();

        float kilosArroz = (float) (comensales * 0.5)/4;
        float kilosGambas = (float) (comensales * 0.25)/4;
        float precioArroz = kilosArroz * kiloArroz;
        float precioGambas = kilosGambas * kiloGambas;

        System.out.println(kilosArroz + " kg arroz");
        System.out.println(kilosGambas + " kg gambas");
        System.out.println(precioArroz + " euros arroz");
        System.out.println(precioGambas + " euros gambas");
        System.out.println("TOTAL: " + (precioArroz + precioGambas) + " euros");
    }
}
