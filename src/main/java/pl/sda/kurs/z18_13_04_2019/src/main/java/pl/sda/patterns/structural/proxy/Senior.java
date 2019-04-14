package pl.sda.patterns.structural.proxy;

public class Senior extends Worker {

    private Regular regular;

    public Senior(String name) {
        super(name);
        this.regular = new Regular("Ten którym gardzę");
    }

    @Override
    public void start() {
        this.regular.start();
    }

    @Override
    public String finish() {
        return this.regular.finish();
    }

}
