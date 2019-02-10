package pl.sda.zajecia4;

import pl.sda.zajecia4.task1.cw6.Grzyb;
import pl.sda.zajecia4.task1.cw6.Muchomor;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int len = numbers.length;

        List<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(3);
        listOfNumbers.add(2);
        listOfNumbers.add(132);
        for (int number : listOfNumbers) {
            System.out.println(number);
        }
        int pierwszyElement = listOfNumbers.get(0);
        listOfNumbers.size(); // rozmiar listy

        List<String> listOfWords = new LinkedList<String>();
        listOfWords.add("First");
        listOfWords.add("aaa");
        listOfWords.add("ddsst");
        listOfWords.remove(1);
        listOfWords.remove("First");
        System.out.println();

        Set<Integer> setOfNumbers = new HashSet<Integer>(); //tylko unikalne wartosci / brak get(indeks) / losowa kolejnosc
        setOfNumbers.add(6);
        setOfNumbers.add(5);
        setOfNumbers.add(8);
        setOfNumbers.add(4);
        setOfNumbers.remove(5);
        for (int a : setOfNumbers) {
            System.out.println(a);
        }
        Set<String> setOfString = new TreeSet<String>(); //posortowane
        setOfString.add("aaa");
        setOfString.add("zzz");
        setOfString.add("bbb");
        for (String s : setOfString) {
            System.out.println(s);
        }
        System.out.println();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        for (int a : linkedHashSet) { // elementy w kolejnosci dodania
            System.out.println(a);
        }
    }
}
