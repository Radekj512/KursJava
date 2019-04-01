package pl.sda.WorldGenerator.Utils;

import pl.sda.WorldGenerator.Country;
import pl.sda.WorldGenerator.World;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.sda.WorldGenerator.Data.Conf.*;

public class Creator {

    public static <T> T get(T t) {
        return t;
    }

    public static World getWorld() {
        return new World(getRandomCountryList());
    }

    private static List<Country> getRandomCountryList() {
        return IntStream.rangeClosed(0, NUMBER_OF_COUNTRIES.getValue())
                .mapToObj(i -> CountryGenerator.getRandomCountry())
                .collect(Collectors.toList());
    }

}
