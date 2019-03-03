package pl.sda.kurs.z10_03_03_2019.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Podaj rozmiar tablicy: ");
        int[] tab = new int[s.nextInt()];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(tab.length + 30);
        }
        System.out.println(Arrays.toString(tab));
        if(isAscending(tab)) System.out.println("Tablica jest rosnąca");
        if(isDescending(tab)) System.out.println("Tablica jest malejaca");
    }


    static boolean isAscending(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isDescending(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length) {
                if (a[i] < a[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}