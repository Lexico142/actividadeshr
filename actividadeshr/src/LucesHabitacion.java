import java.util.Scanner;

public class LucesHabitacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();

        int encendidas = 0;

        if (a) encendidas++;
        if (b) encendidas++;
        if (c) encendidas++;

        if (encendidas == 0) {
            System.out.println("No se ha encendido ninguna luz.");
        } else if (encendidas == 1) {
            System.out.println("Solo hay una luz encendida.");
        } else {
            System.out.println("Hay " + encendidas + " luces encendidas.");
        }

    }
}
