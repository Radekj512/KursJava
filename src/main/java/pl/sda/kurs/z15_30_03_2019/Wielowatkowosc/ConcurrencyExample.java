package pl.sda.kurs.z15_30_03_2019.Wielowatkowosc;

public class ConcurrencyExample {
    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        Thread thread2 = new Thread(new MyRunnable(), "Moja nazwa watku");
//        thread.start();
//        thread2.start();

        DataHolder dataHolder = new AtomDataHolder();

        Thread t1 = new Thread(new Adder(dataHolder));
        Thread t2 = new Thread(new Adder(dataHolder));
        Thread t3 = new Thread(new Adder(dataHolder));

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.currentThread().sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(((AtomDataHolder) dataHolder).getI());


    }
}
