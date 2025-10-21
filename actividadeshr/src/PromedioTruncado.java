import java.util.Scanner;

public class PromedioTruncado {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        float b = src.nextFloat();
        float c = src.nextFloat();

        float total = (a + b + c) / 3;

        int totalFloat = (int) total;
        System.out.println(totalFloat);
    }
}
