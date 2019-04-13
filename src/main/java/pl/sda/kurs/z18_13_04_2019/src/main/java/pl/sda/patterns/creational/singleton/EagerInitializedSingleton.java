package pl.sda.patterns.creational.singleton;

//TODO FIX BUGS
public class EagerInitializedSingleton {

    private static final PropertyLoader instance = new PropertyLoader();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static PropertyLoader getInstance() {
        return instance;
    }
}
