import java.util.Scanner;

public class TodosParesNinguno {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = (int) src.nextFloat();
        float b = (int) src.nextFloat();
        float c = (int) src.nextFloat();

        System.out.println(a % 2 == 0 && b % 2 == 0 && c % 2 == 0 || a % 2 != 0 && b % 2 != 0 && c % 2 != 0);


    }
}
