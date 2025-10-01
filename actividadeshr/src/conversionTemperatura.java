import java.util.Scanner;
public class conversionTemperatura {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        float celsius = src.nextInt();

        float fahrenheit = celsius * 9 / 5 + 32;
        float kelvin = celsius + 273.15f;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

    }
}