import java.util.Scanner;

public class artropodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt() * 6
                + sc.nextInt() * 8
                + sc.nextInt() * 10
                + sc.nextInt() * sc.nextInt() * 2
                + sc.nextInt() * sc.nextInt() * 4;
        System.out.println(total);
    }
}
