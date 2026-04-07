package VectoresDinamicos.Carrito;
import java.util.HashMap;
import java.util.Scanner;

public class Ticket {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Integer> unidad = new HashMap<>();
    static void main(String[] args) {
        Producto p1 = new Producto("Leche", "Básicos", 1.5f, "Lechera Asturiana", 10);
        Producto p2 = new Producto("Pan", "Básicos", 0.5f, "Panadería La Mejor", 20);
        Producto p3 = new Producto("Huevos", "Básicos", 2.0f, "Granja El Sol", 30);
        Producto p4 = new Producto("Manzanas", "Frutas", 0.8f, "Frutería La Fresca", 15);
        Producto p5 = new Producto("Arroz", "Básicos", 1.0f, "Arrocería El Campo", 25);
        Producto p6 = new Producto("Champú", "Higiene", 3.0f, "Cosméticos Belleza", 5);
        Producto p7 = new Producto("Jabón", "Higiene", 1.2f, "Cosméticos Belleza", 8);
        Producto p8 = new Producto("Detergente", "Limpieza", 4.0f, "Limpieza Total", 12);
        Producto p9 = new Producto("Coca-Cola", "Bebidas", 1.0f, "Coca-Cola Company", 18);

        while(true){
            System.out.println("Introduce el nombre del producto (o 'salir' para terminar):");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("salir")) break;

            System.out.println("Introduce la cantidad:");
            int cantidad = sc.nextInt();
            sc.nextLine();

            switch (nombre.toLowerCase()) {
                case "leche" -> unidad.put(p1.getNombre(), cantidad);
                case "pan" -> unidad.put(p2.getNombre(), cantidad);
                case "huevos" -> unidad.put(p3.getNombre(), cantidad);
                case "manzanas" -> unidad.put(p4.getNombre(), cantidad);
                case "arroz" -> unidad.put(p5.getNombre(), cantidad);
                case "champú" -> unidad.put(p6.getNombre(), cantidad);
                case "jabón" -> unidad.put(p7.getNombre(), cantidad);
                case "detergente" -> unidad.put(p8.getNombre(), cantidad);
                case "coca-cola" -> unidad.put(p9.getNombre(), cantidad);
                default -> System.out.println("Producto no encontrado.");
            }
        }

        System.out.println("\n=== Ticket de Compra ===");
        float total = 0;
        for (String producto : unidad.keySet()) {
            int cantidad = unidad.get(producto);
            float precio = switch (producto.toLowerCase()) {
                case "leche" -> p1.getPrecio();
                case "pan" -> p2.getPrecio();
                case "huevos" -> p3.getPrecio();
                case "manzanas" -> p4.getPrecio();
                case "arroz" -> p5.getPrecio();
                case "champú" -> p6.getPrecio();
                case "jabón" -> p7.getPrecio();
                case "detergente" -> p8.getPrecio();
                case "coca-cola" -> p9.getPrecio();
                default -> 0;
            };
            float subtotal = precio * cantidad;
            total += subtotal;
            System.out.println(producto + " x " + cantidad + " = $" + subtotal);
        }
        System.out.println("\nTotal a pagar: €" + total);

    }
}
