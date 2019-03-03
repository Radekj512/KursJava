package pl.sda.kurs.z10_03_03_2019.task3;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        long[] tab = new long[s.nextInt()];
        long tmp;
        tab[0] = 0L;
        tab[1] = 1L;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }
        System.out.println(Arrays.toString(tab));
    }
}
//n=(n-1+n-2)