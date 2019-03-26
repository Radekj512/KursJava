package pl.sda.kurs.z13_16_03_2019.algoritms.sorting;

import java.util.Comparator;

public class SortingChecks {

    public boolean isSorted(int array[]) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; ++i) {
            // System.out.println(array[i] + " <= " + array[i+1]);
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(String array[]) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; ++i) {
            // System.out.println(array[i] + " <= " + array[i+1]);
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(String array[], Comparator<String> comp) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; ++i) {
            // System.out.println(array[i] + " <= " + array[i+1]);
            if (comp.compare(array[i], array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public <T extends Comparable<? super T>> boolean isSorted(T array[]) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; ++i) {
            // System.out.println(array[i] + " <= " + array[i+1]);
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}
