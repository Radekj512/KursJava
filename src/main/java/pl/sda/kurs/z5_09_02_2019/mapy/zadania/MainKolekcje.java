package pl.sda.kurs.z5_09_02_2019.mapy.zadania;

import java.util.Arrays;
import java.util.Collections;

public class MainKolekcje {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{31, 12, 5, 7, -3, 123, 6, 0};
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArr));
    }
}
