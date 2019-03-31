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
import java.util.stream.Collectors;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class CityGenerator {

    City getrandomCity() throws IOException {
        return getOrNull(
                new City(getCityName(),
                        getListOfFlats())
        );
    }

    // IMPLEMENT

    private List<Flat> getListOfFlats() throws IOException {
        Random ran = new Random();
        int minNumberOfFlats = 10;
        int maxNumberOfFlats = 30;
        int numerOfFlats = minNumberOfFlats + ran.nextInt(maxNumberOfFlats);
        FlatGenerator fg = new FlatGenerator();
        System.out.println("liczba mieszkan: " + numerOfFlats);
        List<Flat> flatList = new ArrayList<>();
        for (int i = 0; i < numerOfFlats; i++) {
            flatList.add(fg.getRandomFlat());
        }

        return flatList;
    }

    private String getCityName() throws IOException {
        Path cities = Paths.get("src", "main", "java", "pl", "sda", "kurs", "z15_30_03_2019", "IO", "data", "miasta.txt");
        List<String> cityList;
        cityList = Files.lines(cities).parallel().collect(Collectors.toList());
        Random r = new Random();
        return cityList.get(r.nextInt(cityList.size()));

    }

    public static void main(String[] args) throws IOException {
        CityGenerator cg = new CityGenerator();
        City c = cg.getrandomCity();
        System.out.println(c);
    }
}
