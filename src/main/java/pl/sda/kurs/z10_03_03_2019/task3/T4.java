package pl.sda.kurs.z10_03_03_2019.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Podaj rozmiar tablicy: ");
        int[] tab = new int[s.nextInt() + 1];
        for (int i = 1; i < tab.length; i++) {
            System.out.println("Podaj liczbe: ");
            tab[i] = s.nextInt() / i;
        }
        System.out.println(Arrays.toString(tab));
    }
}
