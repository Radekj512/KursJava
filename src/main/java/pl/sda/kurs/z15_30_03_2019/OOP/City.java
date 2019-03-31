package pl.sda.kurs.z15_30_03_2019.OOP;

import java.util.List;

public class City {

    String name;
    List<Flat> flats;

    public City(String name, List<Flat> flats) {
        this.name = name;
        this.flats = flats;
    }

    public String getName() {
        return name;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", flats=" + flats +
                '}';
    }
}
