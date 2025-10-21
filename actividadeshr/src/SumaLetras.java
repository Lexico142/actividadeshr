import java.util.Scanner;

public class SumaLetras {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        char a = src.next().charAt(0);
        char b = src.next().charAt(0);
        char c = src.next().charAt(0);
        char d = src.next().charAt(0);

        int aa =  a;
        int bb =  b;
        int cc =  c;
        int dd =  d;

        int total = aa + bb + cc + dd;
        System.out.println(total);
    }
}
