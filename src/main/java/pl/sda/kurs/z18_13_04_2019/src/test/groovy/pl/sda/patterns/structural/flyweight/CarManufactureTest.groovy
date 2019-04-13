package pl.sda.patterns.structural.flyweight


import spock.lang.PendingFeature
import spock.lang.Specification

class CarManufactureTest extends Specification {

    @PendingFeature
    def "Should return #car for #type"() {
        expect:
        car == CarManufacture.getCar(type)

        where:
        car          || type
        new Honda()  || CarType.HONDA
        new Toyota() || CarType.TOYOTA
        new Subaru() || CarType.SUBARU

    }
}
