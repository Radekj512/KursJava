package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.City;
import pl.sda.kurs.z15_30_03_2019.OOP.Country;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class CountryGenerator {

    static Country getRandomCountry() {
        return getOrNull(new Country(
                getRandomName(),
                getRandomCityList(),
                getCapital()
        ));
    }

    private static City getCapital() {
        return null;
    }

    private static List<City> getRandomCityList() {


        return Collections.emptyList();
    }

    private static String getRandomName() {
        return null;
    }
}
