import java.util.Locale;
import java.util.Scanner;

public class ArchivosExtension {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        String ext = src.next();
        String archivo = src.nextLine();

        String ext2 = src.next();
        String archivo2 = src.nextLine();

        String ext3 = src.next();
        String archivo3 = src.nextLine();

        String ext4 = src.next();
        String archivo4 = src.nextLine();

        System.out.println(archivo4 + " " + ext4);
        System.out.println(archivo3 + " " + ext3);
        System.out.println(archivo2 + " " + ext2);
        System.out.println(archivo + " " + ext);


    }
}

