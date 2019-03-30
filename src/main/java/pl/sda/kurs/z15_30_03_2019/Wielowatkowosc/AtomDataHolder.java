package pl.sda.kurs.z15_30_03_2019.Wielowatkowosc;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomDataHolder implements DataHolder {
    AtomicInteger i = new AtomicInteger(0);

    public int getI(){
        return i.get();
    }

    @Override
    public void increment() {
        while(true) {
            int currentValue = i.get();
            int newValue = currentValue + 1;

            if (i.compareAndSet(currentValue,newValue)){
                return;
            }
        }
    }
}
