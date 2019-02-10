package pl.sda.kurs.z5_09_02_2019.mapy;

import pl.sda.kurs.z5_09_02_2019.przypomnienie.third.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Person marcinZebra = new Person("Marcin", "Zebra");
        Person adamZebra = new Person("Adam", "Zebra");
        Person wojtekBaran = new Person("Wojtek", "Baran");
        Person waldekBaranowski = new Person("Waldek", "Baranowski");
        Person antoniArbuz = new Person("Antoni", "Arbuz");
        Person aldonaAmbroziak = new Person("aldona", "ambroziak");

        Map<Integer, Person> personMap = new HashMap<>();
        Person thisWillBeNull = personMap.put(5, new Person("a", "b"));
        System.out.println(personMap);
        personMap.put(105, new Person("a", "b"));
        System.out.println(personMap);
        Person thisIsPersonAB = personMap.put(5, new Person("z", "z"));
        System.out.println(personMap);

        System.out.println("\n\n");
        personMap.putIfAbsent(5, new Person("t", "t"));

        Person personKeyNo5 = personMap.get(5); // pobranie wartosci z klucza w mapie

        personMap.containsKey(55); // sprawdzenie czy istenieje klucz w mapie

        for (Map.Entry<Integer, Person> keyValue : personMap.entrySet()) {
            System.out.println(keyValue.getKey() + " " + keyValue.getValue());
        }
        for (Integer key : personMap.keySet()){
            System.out.println(key);
        }
        for (Person person:personMap.values()){
            System.out.println(person);
        }
        personMap.replace(5,new Person("e","e")); // zamienia wartosc pod danym kluczem jesli istnieje

        TreeMap<Integer,Person> treeMap = new TreeMap<>(); // sortowana po kluczach

    }
}
