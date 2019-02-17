package pl.sda.kurs.z8_17_02_2019.watki_thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        ThreadExample t1 = new ThreadExample(cyclicBarrier);
        ThreadExample2 t2 = new ThreadExample2(cyclicBarrier);
        t1.start();
        new Thread(t2).start();

    }
}
