package pl.sda.kurs.z15_30_03_2019.Wielowatkowosc;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Moj runnable " + Thread.currentThread().getName());
    }
}
