package pl.sda.kurs.z5_09_02_2019.przypomnienie.third.z4_03_02_2019;

public class Laptop extends Computer {
    private boolean backlightKeyboard;
    private float screenSize;


    public Laptop(String processorName, int ramInGb, int discSizeInGb, boolean backlightKeyboard, float screenSize) {
        super(processorName, ramInGb, discSizeInGb);
        this.backlightKeyboard = backlightKeyboard;
        this.screenSize = screenSize;
    }

    public boolean isBacklightKeyboard() {
        return backlightKeyboard;
    }

    public float getScreenSize() {
        return screenSize;
    }
}
