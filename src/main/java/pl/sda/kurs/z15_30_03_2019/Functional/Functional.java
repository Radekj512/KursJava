package pl.sda.kurs.z15_30_03_2019.Functional;

import pl.sda.kurs.z15_30_03_2019.OOP.World;
import pl.sda.kurs.z15_30_03_2019.OOP.util.Creator;

import java.util.List;
import java.util.Optional;
import java.util.Random;
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


        //map
        //limit
        //skip
        //filter
        //peek
        //forEach

        //flatMap
        //anyMatch
        //noneMatch
        //allMatch
        //reduce
        //collect
        //count
        //findFirst
        //findAny

        //sequential
        //parallel


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
