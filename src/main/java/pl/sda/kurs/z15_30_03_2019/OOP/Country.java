package pl.sda.kurs.z15_30_03_2019.OOP;
import java.util.List;

public class Country {

    String name;
    List<City> cities;
    City capital;

    public Country(String name, List<City> cities, City capital) {
        this.name = name;
        this.cities = cities;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }

    public City getCapital() {
        return capital;
    }
}
