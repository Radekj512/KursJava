package pl.sda.kurs.z10_03_03_2019.task2;

import java.util.Arrays;

public class T1 {

    private static void wypiszRosnaco(int[] a) {
        if (a.length > 0) {
            System.out.println(a[0]);
            wypiszRosnaco(Arrays.copyOfRange(a, 1, a.length));
        }
    }

    private static void wypiszMalejaco(int[] a) {
        if (a.length > 0) {
            System.out.println(a[a.length-1]);
            wypiszMalejaco(Arrays.copyOfRange(a, 0, a.length-1));
        }
    }


    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        //wypiszRosnaco(tab);
        wypiszMalejaco(tab);

    }
}
