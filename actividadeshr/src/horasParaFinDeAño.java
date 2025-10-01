import java.util.Scanner;

public class horasParaFinDeAño {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int hora = src.nextInt();
        int minutos = src.nextInt();

        int faltantes = 1440 - (hora * 60 + minutos) ;


        System.out.println(faltantes);

    }
}
