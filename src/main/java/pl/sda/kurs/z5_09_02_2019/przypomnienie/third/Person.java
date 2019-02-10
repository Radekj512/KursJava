package pl.sda.kurs.z5_09_02_2019.przypomnienie.third;

import java.util.Objects;

public class Person implements Comparable {
    private String name;
    private String secondName;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int compareTo(Object o) {
        Person otherPerson = (Person) o;
        int i = this.secondName.toLowerCase().compareTo(otherPerson.secondName.toLowerCase());
        if (i == 0) {
            i = this.name.compareToIgnoreCase(otherPerson.name);
        }
        return i;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}
