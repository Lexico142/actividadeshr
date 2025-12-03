import java.util.Scanner;

public class Scrabble2 {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        String asd = src.nextLine();
        String ee = asd.toUpperCase();
        int total = 0;


        for (char a : ee.toCharArray()){
            if (a == 'E'| a == 'A'| a == 'I'| a == 'O'| a == 'U' | a == 'L'| a == 'N'| a == 'R'| a == 'S'| a == 'T' )
                total += 1;
            else if (a == 'D'| a == 'G') total += 2;
            else if (a == 'B'| a == 'C'| a == 'M'| a == 'P') total += 3;
            else if (a == 'F'| a == 'H'| a == 'V'| a == 'W'| a == 'Y') total += 4;
            else if (a == 'K') total += 5;
            else if (a == 'J'| a == 'X') total += 8;
            else total += 10;
        }

        System.out.println(total);


    }
}
