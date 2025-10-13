import java.util.Scanner;

public class ChunksMinecraft {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String mundo = src.next();
        int luz = src.nextInt();
        int distancia = src.nextInt();
        int distanciaMax = src.nextInt();
        boolean slime = src.nextBoolean();
        int alturaSuelo = src.nextInt();

        System.out.println((mundo.equals("overworld") && luz < 7) && distancia > distanciaMax || (slime == false && alturaSuelo >= 50) );
    }
}
