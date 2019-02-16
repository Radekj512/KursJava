package pl.sda.kurs.z7_16_02_2019.cwiczenia.task1;

public abstract class Building {
    private final int NUMBER_OF_FLOORS;

    public Building(int NUMBER_OF_FLOORS) {
        this.NUMBER_OF_FLOORS = NUMBER_OF_FLOORS;
    }

    public final int getNUMBER_OF_FLOORS() {
        return NUMBER_OF_FLOORS;
    }
    public abstract BuildingType getBuildingType();
}
