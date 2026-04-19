package Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;
    private static final String[] PALOS = {"Corazones", "Picas", "Tréboles", "Diamantes"};

    public Baraja() {
        cartas = new ArrayList<>();
        for (String palo : PALOS) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(valor, palo));
            }
        }
    }

    public Carta repartirCarta() {
        if (cartas.isEmpty()) {
            System.out.println("[Baraja nueva barajada]");
            for (String palo : PALOS) {
                for (int valor = 1; valor <= 13; valor++) {
                    cartas.add(new Carta(valor, palo));
                }
            }
        }
        return cartas.remove(cartas.size() - 1);
    }
}
