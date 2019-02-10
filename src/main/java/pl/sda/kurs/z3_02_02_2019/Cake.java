package pl.sda.kurs.z3_02_02_2019;

public class Cake {
    private float flourInKilogram;
    private float waterInLiters;
    private int numberOfEggs;

    public Cake() {
    }

    public Cake(float flourInKilogram, float waterInLiters, int numberOfEggs) {
        this.flourInKilogram = flourInKilogram;
        this.waterInLiters = waterInLiters;
        this.numberOfEggs = numberOfEggs;
    }

    public boolean isTasty() {
        if (flourInKilogram > waterInLiters) {
            return false;
        } else if (numberOfEggs < 1 ||numberOfEggs >= 12){
            return false;
        } else{
            return true;
        }
    }

    public boolean isTasty2() {
        if (moreFlourThanWater() || badNumberOfEggs()){
            return false;
        } else{
            return true;
        }
    }

    private boolean badNumberOfEggs() {
        return numberOfEggs < 1 ||  numberOfEggs > 12;
    }

    private boolean moreFlourThanWater() {
        return flourInKilogram > waterInLiters;
    }
}
