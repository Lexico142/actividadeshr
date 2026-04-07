package VectoresDinamicos.JsonHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> datosPalabra = new HashMap<>();

        String palabra = GestorPalabras.obtenerPalabraAleatoria();

        datosPalabra.put("palabra", palabra);
        datosPalabra.put("longitud", String.valueOf(palabra.length()));
        datosPalabra.put("mayusculas", palabra.toUpperCase());
        datosPalabra.put("invertida", new StringBuilder(palabra).reverse().toString());

        System.out.println("\n=== PALABRA ALEATORIA (HashMap) ===");
        for (String clave : datosPalabra.keySet()) {
            System.out.println(clave + " -> " + datosPalabra.get(clave));
        }
    }
}