package VectoresDinamicos.Ranking;
import java.util.HashMap;
import java.util.Scanner;

public class AdivinaNumero {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Integer> mapa = new HashMap<>();

    static void main(String[] args) {
        while (true) {
        int numero = (int) (Math.random() * 100 + 1);
        int intentos = 0;
        String nombre;

        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        while (true) {
            System.out.print("Adivina el número entre 1 y 100: ");
            int adivinanza = sc.nextInt();
            intentos++;

            if (adivinanza < numero) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (adivinanza > numero) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("Felicidades, " + nombre + "! Has adivinado el número en " + intentos + " intentos.");
                mapa.put(nombre, intentos);
                break;
            }
        }

        System.out.println("Quieres ver el ranking de jugadores? (true/false)");
        if (sc.nextBoolean()) {
            System.out.println("=== Ranking de Jugadores ===");
            for (int i = 1; i <= 100; i++) {
                for (String jugador : mapa.keySet()) {
                    if (mapa.get(jugador) == i) {
                        System.out.println(jugador + ": " + i + " intentos");
                    }
                }
            }
        }
            System.out.println("Quieres jugar de nuevo? (true/false)");
            if (!sc.nextBoolean()) {
                System.out.println("Gracias por jugar");
                break;
            }
        }
    }
}
