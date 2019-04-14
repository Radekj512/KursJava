package pl.sda.patterns.structural.composite;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarRentalTest {
    private static CarRental sut;
    @BeforeAll
    public static void inti(){
        //given
        sut = new CarRental();
    }

    @Test
    void driveAll() {
        //when
        sut.driveAll();
        //then
            //sout brum brum

    }

    @Test
    void addCar() {
        //when

    }

    @Test
    void destroyCar() {
    }

    @Test
    void destroyAll() {
    }
}