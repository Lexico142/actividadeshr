import java.util.Scanner;

public class SumaDosSecuencias {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int len = src.nextInt();
        int[] a = new int[len];
        int[] total = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = src.nextInt();
        }
        
        int len2 = src.nextInt();
        int[] b = new int[len];
        for (int i = 0; i < len2; i++) {
            b[i] = src.nextInt();
        }

        for (int i = 0; i < len; i++) {

            total[i] = a[i] + b[i];
            System.out.print(total[i] + " ");

        }




    }
}
