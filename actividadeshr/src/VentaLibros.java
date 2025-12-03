    import java.util.Scanner;

    public class VentaLibros {
        public static void main(String[] args) {
            Scanner src = new Scanner(System.in);

            String a = src.nextLine();

            char b = a.charAt(0);
            char c = a.charAt(1);
            char d = a.charAt(2);

            int b1 = Character.getNumericValue(b);
            int c1 = Character.getNumericValue(c);
            int d1 = Character.getNumericValue(d);


            int total = b1 + c1 + d1;

            String asd = "";

            System.out.println("La cantidad total de libros vendidos es: " + total);
            if (b1 > c1 && b1 > d1) asd = "Viernes";
            else if (c1 > b1 && c1 > d1) asd = "Sabado";
            else asd = "Domingo";
            System.out.println("El dia con mas ventas ha sido: " + asd);

        }
    }
