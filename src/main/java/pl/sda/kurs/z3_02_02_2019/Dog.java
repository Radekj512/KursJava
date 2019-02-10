package pl.sda.kurs.z3_02_02_2019;

public class Dog {
    private String name;
    private String breed;
    private char gender;

    public Dog(String name, String breed, char gender) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + breed + " " + gender;
    }

}
