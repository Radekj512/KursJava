package pl.sda.patterns.structural.bridge;

import pl.sda.patterns.structural.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color: ");
        super.applyColor();
    }

}
