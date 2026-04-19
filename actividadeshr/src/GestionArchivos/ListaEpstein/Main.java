package GestionArchivos.ListaEpstein;

import java.io.FileReader;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaArchivo = "src/GestionArchivos/ListaEpstein/lista.txt";

        System.out.println("Qué palabra te gustaría buscar en el archivo?");
        String palabraABuscar = sc.nextLine();

        int cantidad = contador(rutaArchivo, palabraABuscar);

        if (cantidad >= 0) {
            System.out.println("====== RESULTADO ======");
            System.out.println("La palabra '" + palabraABuscar + "' aparece " + cantidad + " veces en el archivo.");
        }
    }

    public static int contador(String ruta, String palabraBuscada) {
        int contador = 0;

        try {
            FileReader myReader = new FileReader(ruta);
            Scanner fileScanner = new Scanner(myReader);

            while (fileScanner.hasNextLine()) {
                String linea = fileScanner.nextLine();

                String[] palabras = linea.split("[^\\p{L}]+");

                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }

            fileScanner.close();

        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar leer el archivo.");
            e.printStackTrace();
            return -1;
        }

        return contador;
    }
}