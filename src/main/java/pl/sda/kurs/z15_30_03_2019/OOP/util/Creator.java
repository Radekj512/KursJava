package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.Country;
import pl.sda.kurs.z15_30_03_2019.OOP.World;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Creator {

    public static <T> T getOrNull(T t) {
        return Math.random() > 0.5 ? t : null;
    }

    public static World getWorld() {
        return new World(getRandomCountryList());
    }

    private static List<Country> getRandomCountryList() {
        return IntStream.rangeClosed(0, 40)
                .mapToObj(i -> CountryGenerator.getRandomCountry())
                .collect(Collectors.toList());
    }
}


