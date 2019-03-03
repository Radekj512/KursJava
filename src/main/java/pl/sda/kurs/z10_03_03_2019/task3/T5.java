package pl.sda.kurs.z10_03_03_2019.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Podaj rozmiar tablicy: ");
        int[] tab = new int[s.nextInt()];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(30);
        }
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i + 1 < tab.length)
                if (tab[i] > tab[i + 1]) counter++;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(counter);
    }
}
