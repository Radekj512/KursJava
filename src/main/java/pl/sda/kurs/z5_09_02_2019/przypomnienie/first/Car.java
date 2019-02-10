package pl.sda.kurs.z5_09_02_2019.przypomnienie.first;

public class Car {
    private String model;
    private  Kolor color;

    public Kolor getColor() {
        return color;
    }

    public Car(String model, Kolor color) {
        this.model = model;
        this.color = color;
    }
}
