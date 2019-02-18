package pl.sda.kurs.z8_17_02_2019.watki_thread.task1;

public class Main {
    public static void main(String[] args) {
        SomeClass thread1 = new SomeClass();
        OtherClass thread2 = new OtherClass();

        thread1.start();
        new Thread(thread2).start();


        new Thread(()-> System.out.println("PING")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("PONG");
            }
        }).start();
    }
}
