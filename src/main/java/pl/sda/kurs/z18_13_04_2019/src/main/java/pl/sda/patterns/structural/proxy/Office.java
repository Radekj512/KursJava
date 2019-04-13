package pl.sda.patterns.structural.proxy;

public class Office {

    private String looser;

    public void init() {
        Boss boss = new Boss();
        boss.start();
        this.looser = boss.finish();
    }

    public void printLooser() {
        System.out.println(looser);
    }

}
