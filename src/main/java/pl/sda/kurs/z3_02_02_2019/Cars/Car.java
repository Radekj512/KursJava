package pl.sda.kurs.z3_02_02_2019.Cars;

public class Car {

    private float engineCapacity;
    private int numberOfDoors;
    private String color;
    private boolean manualGear = true;
    private boolean engineStared;

    public Car(float engineCapacity, int numberOfDoors, String color) {
        this.engineCapacity = engineCapacity;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public boolean engineStart() {
        this.engineStared = true;
        return true;
    }

    public boolean isEngineStared() {
        return engineStared;
    }

    public void ride() {
    }

    public boolean SeatbeltsFastened() {
        return true;
    }
}
