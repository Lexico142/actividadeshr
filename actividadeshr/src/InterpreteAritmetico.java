import java.util.Scanner;

public class InterpreteAritmetico {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        float n1 = src.nextFloat();
        char a = src.next().charAt(0);
        float n2 = src.nextFloat();

        switch (a) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;

            default:
                System.out.println("Error: operation not permitted");
        }
    }
}
