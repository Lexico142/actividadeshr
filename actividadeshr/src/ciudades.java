import java.util.Scanner;

public class ciudades{
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        String ciudad = src.nextLine();
        String actividad = src.nextLine();
        String tiempo = src.nextLine();
        String poblacion = src.nextLine();

        System.out.println("Ciudad: " + ciudad);
        System.out.println("Tiempo: " + tiempo);
        System.out.println("Actividad: " + actividad);
        System.out.println("Poblacion: " + poblacion);


    }

}


