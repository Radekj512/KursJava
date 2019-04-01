package pl.sda.WorldGenerator.Data;

public enum Conf {
    MIN_FLAT_AREA(30),
    MAX_FLAT_AREA(150),

    MIN_NUMBER_OF_FLATS_IN_CITY(100),
    MAX_NUMBER_OF_FLATS_IN_CITY(300),

    MIN_NUMBER_OF_CITIES_IN_COUNTRY(100),
    MAX_NUMBER_OF_CITIES_IN_COUNTRY(300),

    NUMBER_OF_COUNTRIES(40;

    private int i;

    Conf(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }
}
