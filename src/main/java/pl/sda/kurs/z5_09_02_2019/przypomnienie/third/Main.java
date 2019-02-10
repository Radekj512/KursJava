package pl.sda.kurs.z5_09_02_2019.przypomnienie.third;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();

        Person marcinZebra = new Person("Marcin", "Zebra");
        Person adamZebra = new Person("Adam", "Zebra");
        Person wojtekBaran = new Person("Wojtek", "Baran");
        Person waldekBaranowski = new Person("Waldek", "Baranowski");
        Person antoniArbuz = new Person("Antoni", "Arbuz");
        Person aldonaAmbroziak = new Person("aldona", "ambroziak");

        persons.add(marcinZebra);
        persons.add(adamZebra);
        persons.add(wojtekBaran);
        persons.add(waldekBaranowski);
        persons.add(antoniArbuz);
        persons.add(aldonaAmbroziak);

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
        persons.sort(Comparator.naturalOrder());
        for (Person person : persons) {
            System.out.println(person);
        }

        /////////////////////////////////////////////////
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("aaa");
        linkedList.add("aaa2");
        linkedList.add(0, "aaa3");  //nieodpowiednie z uwagi na wydajnosc
        linkedList.get(1); // duzo wolniejsze niz ArrayList
        linkedList.addFirst("xxx"); // bardzo szybkie dodawanie
        linkedList.addLast("ccc"); // j/w
        linkedList.getFirst();// bardzo szybkie tak samo jak getLast();
        ///////////////////////
        Set<Integer> numbers = new HashSet<>(); // set tylko unikalne wartosci
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(5);

        HashSet<Person> peopleSet = new HashSet<>();
        Person michal = new Person("Michal", "Jaszczyk");
        Person michal2 = new Person("Michal", "Jaszczyk");
        peopleSet.add(michal);
        peopleSet.add(michal2);
        System.out.println(peopleSet);

        TreeSet<Integer> treeSet = new TreeSet<>(); // automatycznie sortuje dodawane elementy


        treeSet.add(5);
        System.out.println(treeSet);
        treeSet.add(1);
        System.out.println(treeSet);
        treeSet.add(6);
        System.out.println(treeSet);
        treeSet.add(2);
        System.out.println(treeSet);
        treeSet.add(6);
        System.out.println(treeSet);

        TreeSet<Person> personTreeSet = new TreeSet<>();

        personTreeSet.add(marcinZebra);
        System.out.println(personTreeSet);
        personTreeSet.add(adamZebra);
        System.out.println(personTreeSet);
        personTreeSet.add(wojtekBaran);
        System.out.println(personTreeSet);
        personTreeSet.add(waldekBaranowski);
        System.out.println(personTreeSet);
        personTreeSet.add(antoniArbuz);
        System.out.println(personTreeSet);
        personTreeSet.add(aldonaAmbroziak);
        System.out.println(personTreeSet);


        LinkedHashSet<Person> peopleHashSet = new LinkedHashSet<>(); // trzyma kolejnosc w jakiej obiekty sa dodane
    }
}
