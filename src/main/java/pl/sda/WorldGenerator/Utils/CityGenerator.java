package pl.sda.WorldGenerator.Utils;

import pl.sda.WorldGenerator.City;
import pl.sda.WorldGenerator.Flat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.sda.WorldGenerator.Utils.Creator.get;
import static pl.sda.WorldGenerator.Data.Conf.*;

public class CityGenerator {
    Random random = new Random();

    Path citiesPath = Paths.get("src", "main", "java", "pl", "sda", "WorldGenerator", "Data", "miasta.txt");
    List<String> cityList;

    {
        try {
            cityList = Files.lines(citiesPath).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd wyczytywania listy miast");
        }
    }


    City getrandomCity(){
        return get(
                new City(getCityName(),
                        getListOfFlats())
        );
    }
    City getrandomCity(String capital){
        return get(
                new City(capital,
                        getListOfFlats())
        );
    }

    // IMPLEMENT

    private List<Flat> getListOfFlats() {

        int minNumberOfFlats = MIN_NUMBER_OF_FLATS_IN_CITY.getValue();
        int maxNumberOfFlats = MAX_NUMBER_OF_FLATS_IN_CITY.getValue();
        int numerOfFlats = minNumberOfFlats + random.nextInt(maxNumberOfFlats);

        FlatGenerator fg = new FlatGenerator();
        System.out.println("\t\tNowe miasto które ma: " + numerOfFlats + " mieszkań");
        List<Flat> flatList = new ArrayList<>();
        IntStream.range(1, numerOfFlats)
                .mapToObj(i -> flatList.add(fg.getRandomFlat()))
                .collect(Collectors.toList());
        return flatList;
}

    private String getCityName(){
        return cityList.get(random.nextInt(cityList.size()));
    }
}