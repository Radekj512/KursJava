package pl.sda.kurs.z15_30_03_2019.Functional;

import pl.sda.kurs.z15_30_03_2019.OOP.World;
import pl.sda.kurs.z15_30_03_2019.OOP.util.Creator;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Functional {

    public static void main(String[] args) {

        //Optional
        World world = Creator.getWorld();
        Optional.ofNullable(world.getCountries())
                .map(countries -> countries.get(0))
                .map(country -> country.getCities())
                .map(cities -> cities.get(0))
                .orElse(null);


        //Streams
        List<Integer> list = generateRandomIntegerList();

        //anonymous class
        Function<Integer, Integer> pow2 = i -> i * i;
        list.stream().map(pow2);


        // Function<Integer, String>
        list.stream().map(i -> i * i);
        list.stream().map(new Function<Integer, Integer>() {  // to samo co wyzej
            @Override
            public Integer apply(Integer i) {
                return i * i;
            }
        });

        //map
        list.stream().map(i -> i + 1); // dodaj 1 do kazdego elementu listy

        //limit
        list.stream().limit(20L); //ogranicza strumien do liczy podanej w argumencie

        //skip
        list.stream().skip(20L); // pomija podana liczbe elementow

        //filter
        list.stream().filter(i -> i % 2 == 0); //filtruje na podstawie podanego warunku

        //peek
        list.stream().limit(100L)
                .peek(x -> System.out.println(x * x)) // nie uzywac, mapuje wartosci i wypisuje
                .map(pow2)
                .forEach(System.out::println);

        //forEach
        list.stream().forEach(list::add); //wykonuje operacje dla kazdego elementu

        //distinct
        list.stream().distinct(); //zwraca elementy unikalne w strumieniu

        //flatMap
//        list.stream().flatMap(x -> x * 2); // z kilku strumieni robi jeden

        //anyMatch
        list.stream().anyMatch(x -> x % 2 == 0); // ture albo false. sprawdza czy ktorykolwiek z elementow spelnia warunek

        //noneMatch
            // sprawdza czy ktorykolwiek nie spelnia warunku

        //allMatch
            // sprawdza czy wszystkie spelniaja warunek

        //reduce
        list.stream().reduce((x,y) -> x + y); // z wszzystkich elementow strumienia tworzy jeden element

        //collect
//        list.stream().collect(Collectors); //zwraca liste,set, cokolwiek z Collectors

        //count
        list.stream().count(); //liczy elementy strumienia zwraca long

        //findFirst
        list.stream().findFirst(); // zwroc pierwszy element strumienia

        //findAny
        list.stream().findAny(); // zwroc ktorykolwiek element

        //sequential
        list.stream().sequential(); // dziala jak petla for

        //parallel
        list.stream().parallel(); // dziala "wielowatkowo"


        IntStream.range(0,10);
        IntStream.rangeClosed(0,10);

    }

    private static List<Integer> generateRandomIntegerList() {
        Random random = new Random();
        return IntStream.range(0, 1000)
                .map(i -> random.nextInt(100000))
                .boxed()
                .collect(Collectors.toList());
    }

    private static List<Integer> generateRandomIntegerListWithNulls() {
        Random random = new Random();
        return IntStream.range(0, 1000)
                .map(i -> random.nextInt(100000))
                .boxed()
                .map(x -> Math.random() > 0.5 ? x : null)
                .collect(Collectors.toList());
    }
}
