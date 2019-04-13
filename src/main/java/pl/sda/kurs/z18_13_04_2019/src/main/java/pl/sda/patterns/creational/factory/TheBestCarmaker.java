package pl.sda.patterns.creational.factory;

import pl.sda.model.Calibra;
import pl.sda.model.Civic;
import pl.sda.model.Passat;

import java.time.Year;

//TODO 1. Refactor to use factory here
//TODO 2. Use polymorphism
//TODO 3. Try to implement 3 versions of factory:
//TODO 3.1 With simple ifs
//TODO 3.2 With enum
//TODO 3.3 With map instead of ifs
//TODO 4. For all implementations please add junit tests.
public class TheBestCarmaker {

    public Calibra makeCalibra(int door, String color, Year productionYear) {
        return new Calibra(door, color, productionYear);
    }

    public Civic makeCivic(int door, String color, Year productionYear) {
        return new Civic(door, color, productionYear);
    }

    public Passat makePassat(int door, String color, Year productionYear) {
        return new Passat(door, color, productionYear);
    }

}
