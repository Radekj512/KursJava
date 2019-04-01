package pl.sda.WorldGenerator.Utils;

import pl.sda.WorldGenerator.City;
import pl.sda.WorldGenerator.Country;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.sda.WorldGenerator.Data.Conf.*;
import static pl.sda.WorldGenerator.Utils.Creator.get;

public class CountryGenerator {
    static Path countriesAndCapitalsPath = Paths.get("src", "main", "java", "pl", "sda", "WorldGenerator", "Data", "countriesAndCapitals.txt");
    static Random random = new Random();
    static List<String> countriesList = new ArrayList<>();
    static List<String> capitalsList = new ArrayList<>();
    static int countryListSize;

    static{
        try {
            Files.lines(countriesAndCapitalsPath)
                    .map(line -> line.split(" — "))
                    .map(country -> countriesList.add(country[0]))
                    .collect(Collectors.toList()); //TODO -> sprawdz czy potrzebne
            Files.lines(countriesAndCapitalsPath)
                    .map(line -> line.split(" — "))
                    .map(capital -> capitalsList.add(capital[1]))
                    .collect(Collectors.toList());

            countryListSize = countriesList.size();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd wczytywania państw lub stolic");
        }
    }

    static Country getRandomCountry() {
        return get(new Country(
                getRandomName(),
                getRandomCityList(),
                getCapital()
        ));
    }


    private static City getCapital() {
        CityGenerator cg = new CityGenerator();
        return cg.getrandomCity(capitalsList.get(random.nextInt(capitalsList.size())));
    }

    private static List<City> getRandomCityList() {
        CityGenerator cg = new CityGenerator();
        List<City> cityList = new ArrayList<>();
        int cityMin = MIN_NUMBER_OF_CITIES_IN_COUNTRY.getValue();
        int cityMax = MAX_NUMBER_OF_CITIES_IN_COUNTRY.getValue();
        int citiesNumber = cityMin + random.nextInt(cityMax);

        System.out.println("Nowe panstwo które ma " + citiesNumber + " miast");

        IntStream.range(1, citiesNumber).parallel()
                .mapToObj(i -> cityList.add(cg.getrandomCity()))
                .collect(Collectors.toList());
        return cityList;
    }

    private static String getRandomName() {
        return countriesList.get(random.nextInt(countryListSize));
    }
}
