package EjercicioObjetos1.Pokedex;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Pokemon pokedex = new Pokemon("Yvysaur", "Planta", 45, 49, false, 65, "Venusaur", "Bulbasaur");
            pokedex.mostrarInfo();
        System.out.println("Quieres ver la evolucion? (true/false)");
        boolean evolucion = src.nextBoolean();
        if (evolucion) {
            pokedex.mostrarEvolucion();
        }
        System.out.println("Quieres ver la pre-evolucion? (true/false)");
        boolean preEvolucion = src.nextBoolean();
        if (preEvolucion) {
            pokedex.mostrarInvolucion();
        }
    }
}
