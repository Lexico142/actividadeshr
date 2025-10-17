import java.util.Scanner;

public class CarreraCaballos {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int velocidadMax = src.nextInt();
        int resistencia = src.nextInt();
        int pesoJinete = src.nextInt();
        int inicioCarrera = src.nextInt();

        int velocidadMax2 = src.nextInt();
        int resistencia2 = src.nextInt();
        int pesoJinete2 = src.nextInt();
        int inicioCarrera2 = src.nextInt();

        int velocidadMax3 = src.nextInt();
        int resistencia3 = src.nextInt();
        int pesoJinete3 = src.nextInt();
        int inicioCarrera3 = src.nextInt();

        int velocidadMax4 = src.nextInt();
        int resistencia4 = src.nextInt();
        int pesoJinete4 = src.nextInt();
        int inicioCarrera4 = src.nextInt();

        int caballo = velocidadMax + resistencia - pesoJinete + inicioCarrera;
        int caballo2 = velocidadMax2 + resistencia2 - pesoJinete2 + inicioCarrera2;
        int caballo3 = velocidadMax3 + resistencia3 - pesoJinete3 + inicioCarrera3;
        int caballo4 = velocidadMax4 + resistencia4 - pesoJinete4 + inicioCarrera4;

        boolean ganador = caballo > caballo2 && caballo > caballo3 && caballo > caballo4;
        boolean ganador2 = caballo2 > caballo && caballo2 > caballo3 && caballo2 > caballo4;
        boolean ganador3 = caballo3 > caballo && caballo3 > caballo2 && caballo3 > caballo4;
        boolean ganador4 = caballo4 > caballo && caballo4 > caballo2 && caballo4 > caballo3;

        System.out.println("Caballo 1: " + ganador);
        System.out.println("Caballo 2: " + ganador2);
        System.out.println("Caballo 3: " + ganador3);
        System.out.println("Caballo 4: " + ganador4);


    }
}
