package pl.sda.zajecia4.task1.cw1;

public class Tv {
    private String name = "Telewizor bez marki";
    private int screenSize = 40;
    private boolean hangable = false;

    public Tv(String name, int screenSize, boolean hangable) {
        this.name = name;
        this.screenSize = screenSize;
        this.hangable = hangable;
    }

    public String getName() {
        return name;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public boolean isHangable() {
        return hangable;
    }
}
