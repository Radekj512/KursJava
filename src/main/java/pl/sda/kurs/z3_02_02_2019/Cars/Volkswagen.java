package pl.sda.kurs.z3_02_02_2019.Cars;

public class Volkswagen extends Car {

    public Volkswagen(int numberOfDoors, String color) {
        super(1.4f, numberOfDoors, color);
    }

    @Override
    public void ride() {
        engineStart();
        System.out.println("Jadę szybko");
    }
}

