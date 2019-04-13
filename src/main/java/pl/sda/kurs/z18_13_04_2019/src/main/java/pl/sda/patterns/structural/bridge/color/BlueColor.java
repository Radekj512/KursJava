package pl.sda.patterns.structural.bridge.color;

import static pl.sda.patterns.structural.bridge.color.ColorType.BLUE;

public class BlueColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("blue.");
    }

    @Override
    public ColorType getMyColor() {
        return BLUE;
    }
}
