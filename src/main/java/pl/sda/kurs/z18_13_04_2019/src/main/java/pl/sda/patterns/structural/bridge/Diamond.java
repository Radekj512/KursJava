package pl.sda.patterns.structural.bridge;

import pl.sda.patterns.structural.bridge.color.Color;

public class Diamond extends Shape {

    public Diamond(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Diamond filled with color: ");
        super.applyColor();
    }

}
