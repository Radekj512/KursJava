package pl.sda.kurs.z15_30_03_2019.Wielowatkowosc;

public class IntDataHolder implements DataHolder {
    int i;

    public int getI() {
        return i;
    }

    @Override
    public void increment() {
        i++;
    }
}
