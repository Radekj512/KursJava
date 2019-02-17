package pl.sda.kurs.z8_17_02_2019.watki_thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class ThreadExample2 implements Runnable {
    CyclicBarrier cyclicBarrier;
    public ThreadExample2(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        int i = 0;
        while (i<10){
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("BBBBBBBBBBBB");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
