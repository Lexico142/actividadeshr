import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        String d = src.next();
        String m = src.next();
        String a = src.next();

        System.out.println(d+"/"+m+"/"+a);
    }
}