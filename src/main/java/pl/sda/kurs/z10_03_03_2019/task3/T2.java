package pl.sda.kurs.z10_03_03_2019.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Podaj rozmiar tablicy: ");
        int[] tab = new int[s.nextInt()];
        System.out.print("Podaj poczatek przedzialu: ");
        int min = s.nextInt();
        System.out.print("Podaj koniec przedzialu: ");
        int max = s.nextInt();
        for (int i = 0; i < tab.length; i++){
            tab[i] = min+r.nextInt(max-min+1);
        }
        System.out.println(Arrays.toString(tab));
    }
}
