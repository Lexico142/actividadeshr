package Blackjack;


import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private String nombre;
    private List<Carta> mano;
    private boolean plantado;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.plantado = false;
    }

    public void pedirCarta(Carta carta) {
        mano.add(carta);
    }

    public void plantarse() {
        this.plantado = true;
    }

    public int getPuntuacion() {
        int total = 0;
        int ases = 0;

        for (Carta carta : mano) {
            total += carta.getValorJuego();
            if (carta.esAs()) ases++;
        }
        while (total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }

        return total;
    }

    public boolean estaPasado() {
        return getPuntuacion() > 21;
    }

    public boolean tieneBlackjack() {
        return mano.size() == 2 && getPuntuacion() == 21;
    }

    public void resetearMano() {
        mano.clear();
        plantado = false;
    }

    public void mostrarMano() {
        System.out.print(nombre + ": ");
        for (int i = 0; i < mano.size(); i++) {
            System.out.print(mano.get(i));
            if (i < mano.size() - 1) System.out.print(", ");
        }
        System.out.println(" [" + getPuntuacion() + " puntos]");
    }

    public void mostrarPrimeraCarta() {
        System.out.println(nombre + ": " + mano.get(0) + ", [carta oculta]");
    }

    public String getNombre() { return nombre; }
    public List<Carta> getMano() { return mano; }
    public boolean isPlantado() { return plantado; }
}
