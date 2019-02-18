package pl.sda.kurs.z8_17_02_2019.watki_thread.task1;

public class SomeClass extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("t1  -----  " + i);
            }
            try {
                sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
