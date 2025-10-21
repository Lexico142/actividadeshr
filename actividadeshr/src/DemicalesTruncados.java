import java.util.Scanner;

public class DemicalesTruncados {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float a = src.nextFloat();
        float b = src.nextFloat();

        int aa = (int) a;
        int bb = (int) b;

        System.out.println(aa > bb);
        System.out.println(bb < aa);
        System.out.println(aa == bb);
    }
}
