package pl.sda.kurs.z15_30_03_2019.Wielowatkowosc;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Mój wątek " + Thread.currentThread().getName());
    }
}
