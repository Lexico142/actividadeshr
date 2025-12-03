import java.util.Scanner;

public class JumpJump {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int saltos = 0;
        int a = src.nextInt();

        while (true){
            int b = a;
            a = src.nextInt();
            if (a > b) saltos++;
            if (a == -1) break;
        }
        System.out.println(saltos);
    }
}
