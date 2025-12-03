import java.util.Scanner;

public class ComidasRestaurante {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();


        int total = b + c;

        System.out.println("MENU:");
        System.out.println("1.- DESAYUNOS");
        System.out.println("2.- COMIDAS");
        System.out.println("3.- MERIENDAS");
        System.out.println("4.- CENAS\n");

        switch(a){
            case 1:
                System.out.println("Total DESAYUNOS del restaurante A y B: " + total);
                break;
            case 2:
                System.out.println("Total COMIDAS del restaurante A y B: " + total);
                break;
            case 3:
                System.out.println("Total MERIENDAS del restaurante A y B: " + total);
                break;
            case 4:
                System.out.println("Total CENAS del restaurante A y B: " + total);
                break;

            default:
                System.out.println("OPCION INEXISTENTE !!");
                break;


        }

    }
}
