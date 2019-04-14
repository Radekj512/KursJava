package pl.sda.patterns.structural.bridge.color;

import static pl.sda.patterns.structural.bridge.color.ColorType.GREEN;

public class GreenColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("green.");
    }

    @Override
    public ColorType getMyColor() {
        return GREEN;
    }
}
