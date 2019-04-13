package pl.sda.patterns.structural.composite;

import pl.sda.model.Car;
import pl.sda.model.Driveable;

import java.util.ArrayList;
import java.util.List;

//TODO fill the methods and test it
class CarRental {

    private List<Car> list = new ArrayList<>();

    void driveAll() {
        list.forEach(Driveable::drive);
    }

    void addCar(Car car) {

    }

    void destroyCar(Car car) {

    }

    void destroyAll() {

    }
}
