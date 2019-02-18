package pl.sda.kurs.z8_17_02_2019.watki_thread.task1;

public class OtherClass implements Runnable {
    @Override
    public void run() {
        for (int i = 50; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println("t2  -----  " + i);
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
