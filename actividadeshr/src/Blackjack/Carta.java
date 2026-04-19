package Blackjack;

public class Carta {

    private int valor;
    private String palo;

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValorJuego() {
        if (valor == 1) return 11;
        if (valor >= 11) return 10;
        return valor;
    }

    public boolean esAs() {
        return valor == 1;
    }

    public String getNombreValor() {
        return switch (valor) {
            case 1  -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(valor);
        };
    }

    public int getValor() { return valor; }
    public String getPalo() { return palo; }

    @Override
    public String toString() {
        return getNombreValor() + " de " + palo;
    }
}
