package pl.sda.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static PropertyLoader instance;

    private ThreadSafeSingleton() {
    }

    public synchronized static PropertyLoader getInstance() {
        if (instance == null) {
            instance = new PropertyLoader();
        }
        return instance;
    }
}
