package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.City;
import pl.sda.kurs.z15_30_03_2019.OOP.Flat;

import java.util.Collections;
import java.util.List;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class CityGenerator {

    City getrandomCity() {
        return getOrNull(
                new City(getCityName(),
                        getListOfFlats())
        );
    }

    // IMPLEMENT

    private List<Flat> getListOfFlats() {
        return Collections.emptyList();
    }

    private String getCityName() {
        return null;
    }
}
