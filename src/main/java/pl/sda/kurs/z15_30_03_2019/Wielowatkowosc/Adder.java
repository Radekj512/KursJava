package pl.sda.kurs.z15_30_03_2019.Wielowatkowosc;

public class Adder implements Runnable {
    DataHolder dataHolder;

    public Adder(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dataHolder.increment();
        }
    }
}
