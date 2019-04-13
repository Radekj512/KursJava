package pl.sda.patterns.creational.singleton;

//TODO fix bugs
public class StaticBlockSingleton {

    private static PropertyLoader instance;

    private StaticBlockSingleton() {
    }

    //static block initialization for exception handling
    static {
        try {
            PropertyLoader instance = new PropertyLoader();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static PropertyLoader getInstance() {
        return instance;
    }
}
