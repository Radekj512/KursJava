package pl.sda.patterns.structural.proxy;

public class Regular extends Worker {

    private Junior junior;

    public Regular(String name) {
        super(name);
        this.junior = new Junior("Świeżak");
    }

    @Override
    public void start() {
        this.junior.start();
    }

    @Override
    public String finish() {
        return this.junior.finish();
    }
}
