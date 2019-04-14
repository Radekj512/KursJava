package pl.sda.patterns.structural.proxy;

public class Boss extends Worker {

    private Senior senior;

    public Boss() {
        super("Janusz");
        this.senior = new Senior("Najlepszy pracownik");
    }

    @Override
    public void start() {
        this.senior.start();
    }

    @Override
    public String finish() {
        return this.senior.finish();
    }
}
