import java.util.Scanner;

public class Caracol {
    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);
        int metrosLleva= 0;
        int metrosPalo = src.nextInt();
        int metrosSubir = src.nextInt();
        int metrosBajar = src.nextInt();
        int metrosDia = 0;
        int dias = 0;
        for (int i = 0; i < 1000; i++) {
            metrosDia = metrosLleva + metrosSubir;
            metrosLleva = metrosLleva + metrosSubir - metrosBajar;
            dias += 1;
            if (metrosDia >= metrosPalo) break;
        }
        System.out.println(dias);


    }
}
