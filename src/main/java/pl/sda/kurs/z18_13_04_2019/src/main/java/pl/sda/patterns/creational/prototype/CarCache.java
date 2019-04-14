package pl.sda.patterns.creational.prototype;

import pl.sda.model.Car;

//TODO let's imagine that taking cars from the DB is costly
//TODO we should implement simple cache here to store existing
//TODO cars taken from db in memory and retrieve them almost immediately
//TODO please think how to implement cache that it can be thread safe
public class CarCache {

    public void init() {

    }

    public Car getCar(String type) {
        return null;
    }

    public int getSize() {
        return 3; //TODO fixme hardcoded value
    }
}
