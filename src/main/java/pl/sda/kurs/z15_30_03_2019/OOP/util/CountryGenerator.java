package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.City;
import pl.sda.kurs.z15_30_03_2019.OOP.Country;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class CountryGenerator {

    static Country getRandomCountry() throws IOException {
        return getOrNull(new Country(
                getRandomName(),
                getRandomCityList(),
                getCapital()
        ));
    }


    private static City getCapital() throws IOException {
        CityGenerator cg = new CityGenerator();
        return cg.getrandomCity();
    }

    private static List<City> getRandomCityList() throws IOException {
        CityGenerator cg = new CityGenerator();
        Random r = new Random();
        List<City> cityList = new ArrayList<>();
        int cityMin = 10;
        int cityMax = 50;
        int citiesNumber = cityMin + r.nextInt(cityMax);
        System.out.println("Nowe panstwo które ma " + citiesNumber + " miast");
        IntStream.range(1,citiesNumber).parallel()
                .mapToObj(i-> {
                    try {
                        return cityList.add(cg.getrandomCity());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return cityList;
                }).collect(Collectors.toList());
        /*for (int i = 0 ; i< citiesNumber; i++){
            cityList.add(cg.getrandomCity());
        }*/

        return cityList;
    }

    private static String getRandomName() throws IOException {
        List<String> countriesList = new ArrayList<>();
        Path countriesAndCapitalsPath = Paths.get("src","main","java","pl","sda","kurs","z15_30_03_2019","IO","data","countriesAndCapitals.txt");
        Files.lines(countriesAndCapitalsPath)
                .map(x-> x.split(" — "))
                .map(country -> countriesList.add(country[0]))
                .collect(Collectors.toList());
        Random r = new Random();
        return countriesList.get(r.nextInt(countriesList.size()));
    }

    public static void main(String[] args) throws IOException {
        CountryGenerator cg = new CountryGenerator();
        Country c = cg.getRandomCountry();
        System.out.println(c);
    }
}
