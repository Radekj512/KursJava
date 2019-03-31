package pl.sda.kurs.z15_30_03_2019.OOP;

import java.util.List;

public class Flat {

    double area;
    List<Person> people;

    public Flat(double area, List<Person> people) {
        this.area = area;
        this.people = people;
    }

    public double getArea() {
        return area;
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", people=" + people +
                '}';
    }
}
