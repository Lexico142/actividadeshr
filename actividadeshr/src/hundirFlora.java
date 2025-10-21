import java.util.Scanner;

public class hundirFlora {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int c = src.nextInt();
        int f = src.nextInt();

        int cc = c + 96;

        char res = (char) cc;
        String a = res + "" + f;
        System.out.println(a);
        System.out.println(a.equals("b5") ||a.equals("a2") || a.equals("b2") || a.equals("g3") || a.equals("g7") || a.equals("h7") || a.equals("f7"));
    }
}
