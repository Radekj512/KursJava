package pl.sda.patterns.creational.singleton;

//TODO fix bugs
public class LazyInitializedSingleton {
    private static PropertyLoader instance;

    private LazyInitializedSingleton() {
    }

    public static PropertyLoader getInstance() {
        instance = new PropertyLoader();
        return instance;
    }
}
