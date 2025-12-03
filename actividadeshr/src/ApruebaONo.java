import java.util.Scanner;

public class ApruebaONo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String cantidadString = src.nextLine();


        int cantidad = Integer.parseInt(cantidadString);

        for (int i = 0; i < cantidad; i++) {


            String nombre = src.next();
            String apellido = src.next();
            float nota = src.nextFloat();

            String aprueba = "suspende";
            if (nota >= 5) aprueba = "aprobado";
            System.out.println(nombre + " " + apellido + ": " + aprueba);

        }
    }
}
