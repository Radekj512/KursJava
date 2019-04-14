package pl.sda.patterns.creational.factory;

import com.google.common.collect.ImmutableMap;
import pl.sda.model.*;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;

//DONE 1. Refactor to use factory here
//DONE 2. Use polymorphism
//TODO 3. Try to implement 3 versions of factory:
//DONE 3.1 With simple ifs
//DONE 3.2 With enum
//TODO 3.3 With map instead of ifs
//TODO 4. For all implementations please add junit tests.
public class TheBestCarmaker {

    private Map<CarType, Car> carMap = ImmutableMap
            .of(
                    CarType.CALIBRA, new Calibra(),
                    CarType.CIVIC, new Civic(),
                    CarType.PASSAT, new Passat()
            );


    public Calibra makeCalibra(int door, String color, Year productionYear) {
        return new Calibra(door, color, productionYear);
    }

    public Civic makeCivic(int door, String color, Year productionYear) {
        return new Civic(door, color, productionYear);
    }

    public Passat makePassat(int door, String color, Year productionYear) {
        return new Passat(door, color, productionYear);
    }

    public Car createFromMap(CarType carType, int door, String color, Year productionYear){
        Car car = carMap.get(carType);
        car.setColor(color);
        car.setDoor(door);
        car.setProductionYear(productionYear);
        return car;
    }


    public Car create(CarType carType, int door, String color, Year productionYear) {
        switch (carType) {
            case CIVIC:
                return new Civic(door, color, productionYear);
            case PASSAT:
                return new Passat(door, color, productionYear);
            case CALIBRA:
                return new Calibra(door, color, productionYear);
            default:
                throw new RuntimeException("Unsupported car type");
        }
    }


}
