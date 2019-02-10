package pl.sda.kurs.z2_27_01_2019;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] anotherArr = new int[]{5, 7, 8, 2, 2, 3, 4};
        // printArray(anotherArr);
        // printArrayForeach(anotherArr);
        System.out.println(printPrettyArray(anotherArr));
        System.out.println(Arrays.toString(findMinMax(anotherArr)));


    }

    public static void printArray(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + ", ");
        }
    }

    public static void printArrayForeach(int[] t) {
        for (int a : t) {
            System.out.print(a + " ");
        }
    }

    public static String printPrettyArray(int[] tab) {
        String result = "[";
        for (int i = 0; i < tab.length; i++) {
            if (i == tab.length - 1) {
                result += tab[i] + "]";
                continue;
            }
            result += tab[i] + ", ";
        }
        return result;
    }

    public static int[] findMinMax(int[] tab) {
        int min = tab[0];
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
            if (tab[i] < min)
                min = tab[i];
        }
        int[] result = new int[]{min, max};
        return result;
    }
}

