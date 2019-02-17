package pl.sda.kurs.z8_17_02_2019.watki_thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadExample extends Thread {
    CyclicBarrier cyclicBarrier;
    public ThreadExample(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        int i = 0;
        while (i<10){
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
