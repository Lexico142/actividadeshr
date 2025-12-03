import java.util.Scanner;

public class LetrasScrabble {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        char a = src.next().charAt(0);

        if (a == 'E'| a == 'A'| a == 'I'| a == 'O'| a == 'U' | a == 'L'| a == 'N'| a == 'R'| a == 'S'| a == 'T' )
            System.out.println(1);
        else if (a == 'D'| a == 'G') System.out.println(2);
        else if (a == 'B'| a == 'C'| a == 'M'| a == 'P') System.out.println(3);
        else if (a == 'F'| a == 'H'| a == 'V'| a == 'W'| a == 'Y') System.out.println(4);
        else if (a == 'K') System.out.println(5);
        else if (a == 'J'| a == 'X') System.out.println(8);
        else System.out.println(10);
    }}
