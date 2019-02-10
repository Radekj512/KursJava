package pl.sda.kurs.z3_02_02_2019.Cars;

public class Mercedes extends Car {

    private boolean sportVersion;

    public Mercedes(float engineCapacity, String color, boolean sportVersion) {
        super(engineCapacity, 4, color);
        this.sportVersion = sportVersion;
    }

    @Override
    public void ride() {
        if (isEngineStared()) {
            System.out.println("Jadę bardzo szybko");
        } else {
            System.out.println("Nie jadę");
        }
    }

    public boolean isSportVersion() {
        return sportVersion;
    }
}
