package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.City;
import pl.sda.kurs.z15_30_03_2019.OOP.Flat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class CityGenerator {

    City getrandomCity() throws IOException {
        return getOrNull(
                new City(getCityName(),
                        getListOfFlats())
        );
    }

    // IMPLEMENT

    private List<Flat> getListOfFlats() {
        Random ran = new Random();
        int minNumberOfFlats = 100;
        int maxNumberOfFlats = 10000;
        int numerOfFlats = minNumberOfFlats + ran.nextInt(maxNumberOfFlats);
        FlatGenerator fg = new FlatGenerator();
        List<Flat> flatList = new ArrayList<>();
        for (int i = 0; i < numerOfFlats; i++){
            flatList.add(fg.getRandomFlat());
        }

        return Collections.emptyList();
    }

    private String getCityName() throws IOException {
        Path cities = Paths.get("src","main","java","pl","sda","kurs","z15_30_03_2019","IO","data","miasta.txt");
        return Files.lines(cities).findAny().get();
    }
}
