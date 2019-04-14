package pl.sda.model;

import java.time.Year;

public class Passat extends Car {
    public Passat() {
    }

    public Passat(int door, String color, Year productionYear) {
        super(door, color, productionYear);
    }
}
