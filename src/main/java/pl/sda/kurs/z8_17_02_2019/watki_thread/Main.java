package pl.sda.kurs.z8_17_02_2019.watki_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;


public class Main {
    private static Object threadBlocker = new Object();
    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        ThreadExample t1 = new ThreadExample(cyclicBarrier);
        ThreadExample2 t2 = new ThreadExample2(cyclicBarrier);
        t1.start();
        new Thread(t2).start();


        List<String> list = new ArrayList<>();
        synchronized (threadBlocker){
            list.add("aaa"); // newralgiczne operacje powinny byc wewnatrz synchronized
        }

    }
}
