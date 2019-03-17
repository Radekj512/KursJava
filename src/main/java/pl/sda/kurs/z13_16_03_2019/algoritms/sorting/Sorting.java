package pl.sda.kurs.z13_16_03_2019.algoritms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public int[] bubbleSort(int array[]) {
        int out[] = array.clone();
        bubbleSortInner(out);
        return out;
    }

    /**
     * https://en.wikipedia.org/wiki/Bubble_sort#Pseudocode_implementation
     */
    private void bubbleSortInner(int array[]) {
        int tmp;
        int n = array.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            n--;
        } while (n > 1);

    }

    public int[] quickSort(int array[]) {
        int out[] = array.clone();
        if (array.length == 0) return array;
        quickSortInner(out, 0, out.length - 1);
        return out;
    }

    /**
     * https://en.wikipedia.org/wiki/Quicksort#Lomuto_partition_scheme
     */
    private void quickSortInner(int[] out, int low, int high) {
        int i = low;
        int j = high;
        int x = out[(low + high) / 2];
        int tmp;
        do {
            while (out[i] < x) i++;
            while (out[j] > x) j--;

            if (i <= j) {
                tmp = out[i];
                out[i] = out[j];
                out[j] = tmp;
                i++;
                j--;
            }
        } while (i <= j);
        if (low < j) quickSortInner(out, low, j);
        if (i < high) quickSortInner(out, i, high);

    }

    /**
     * https://en.wikipedia.org/wiki/Merge_sort#Top-down_implementation_using_lists
     */
    public int[] mergeSort(int array[]) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            r[i - mid] = array[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);
// merge arrays

        return merge(l, r);
    }

    public int[] merge(int[] l, int[] r) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> ret = new ArrayList<>();
        for (int x : l) {
            left.add(x);
        }
        for (int x : r) {
            right.add(x);
        }
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) < right.get(0)) {
                ret.add(left.remove(0));
            } else {
                ret.add(right.remove(0));
            }
        }
        while (!left.isEmpty()) {
            ret.add(left.remove(0));
        }
        while (!right.isEmpty()) {
            ret.add(right.remove(0));
        }
        int[] retArray = new int[ret.size()];

        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = ret.get(i);
        }
        return retArray;
    }

    /**
     * Tu trzeba skorzystać z kopii wcześniej zaimplementowanego algorytmu,
     * dostosowując go do porównywania łańcuchów znakowych.
     */
    public String[] sortStrings(String[] array) {
        Arrays.sort(array);
        return array;
    }

    /**
     * Potrzebna jest implementacja Comparatora, który potrafi porównywać liczby
     * zapisane w łańcuchach znakowych tak, jakby były zwykłymi liczbami.
     */
    @SuppressWarnings("unchecked")
    public ArrayList<String> sortWithComparator(ArrayList<String> array, Comparator<String> comp) {
        ArrayList<String> out = (ArrayList<String>) array.clone();
        out.sort(comp);
        return out;
    }

    public <T extends Comparable<? super T>> T[] sortComparable(T array[]) {
        T[] out = array.clone();
        sortComparableInner(out);
        return out;
    }

    /**
     * Implementacja compareTo klasy Person jest pusta. Sortowanie powinno nastąpić
     * po nazwiskach, a potem po imionach.
     */
    private <T extends Comparable<? super T>> void sortComparableInner(T[] array) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
