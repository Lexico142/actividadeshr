import java.util.Scanner;

public class SistemaCompras {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int cantidadProductos = src.nextInt();
        int precioUnitario = src.nextInt();
        int dineroDisponible = src.nextInt();
        int limiteProductos = src.nextInt();
        int precioMinimo = src.nextInt();

        int total = precioUnitario * cantidadProductos;
        float cambio = dineroDisponible - total;

        boolean compraValida = cantidadProductos <= limiteProductos && dineroDisponible >= total;
        System.out.println("Compra valida: " + compraValida);
        boolean envioGratis = precioMinimo <= total;
        System.out.println("Envio gratis: " + envioGratis);
        System.out.println("Cambio: " + cambio);

    }
}
