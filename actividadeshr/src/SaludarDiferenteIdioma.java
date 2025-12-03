import java.util.Scanner;

public class SaludarDiferenteIdioma {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        String a = src.nextLine();

        switch(a){
            case "French":
                System.out.println("Bonjour");
                break;
            case "Spanish":
                System.out.println("Hola");
                break;
            case "Russian":
                System.out.println("Zdravstvuyte");
                break;
            case "Chinese":
                System.out.println("Nin hao");
                break;
            case "Japanese  ":
                System.out.println("Konnichiwa");
                break;
            case "German":
                System.out.println("Guten Tag");
                break;
            case "Portuguese":
                System.out.println("Ola");
                break;
            case "Arabic":
                System.out.println("Asalaam alaikum");
                break;
            case "Hindi":
                System.out.println("Namaste");
                break;
            case "Romanian":
                System.out.println("Buna ziua");
                break;
            default:
                String b = src.nextLine();
                System.out.println("No conozco tu idioma, como se dice hola?");
                System.out.println(b);
        }
    }
}
