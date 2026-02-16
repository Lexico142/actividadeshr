package hackerrank;

import java.util.Scanner;

public class RanaSaltarina {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        int len = src.nextInt();
        int[] a = new int[len];
        boolean aa = false;
        int cae = 0;
        boolean saltoL = false;
        boolean saltoC = false;

        for (int i = 0; i < len; i++) {
            a[i] = src.nextInt();
        }
        if (a[0] != 1) {
            for (int i = 0; i < len; i++) {
                if ((i + 1) <= len - 2) {
                    saltoC = true;
                } else saltoC = false;

                if ((i + 2) <= len - 1) {
                    saltoL = true;
                } else saltoL = false;

                if (saltoC || saltoL) {
                    if (a[i + 1] == 0 || a[i + 2] == 0) aa = true;
                    else {
                        if (a[i + 1] == 1) {
                            aa = false;
                            cae = i + 2;
                            break;
                        } else {
                            aa = false;
                            cae = i + 3;
                            break;
                        }
                    }
                }

            }
        }
        System.out.println(aa);
        if (!aa) {
            System.out.println(cae);
        }
    }

}
