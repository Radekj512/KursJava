package pl.sda.patterns.structural.bridge.color;

import static pl.sda.patterns.structural.bridge.color.ColorType.RED;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("red.");
    }

    @Override
    public ColorType getMyColor() {
        return RED;
    }
}
