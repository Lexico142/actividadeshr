import java.util.Scanner;

public class TimbreInstituto {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String a = src.next();
        String b = src.next();
        String c = src.next();

        if (c.equals("automatic")) {
            if (b.equals("00")) System.out.println("RING");
            else System.out.println("---");
        }
        if (c.equals("manual")) System.out.println("RING");

    }
}
