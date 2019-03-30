package pl.sda.kurs.z15_30_03_2019.OOP;

import java.util.List;

public class World {
    List<Country> countries;

    public World(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
