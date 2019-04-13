package pl.sda.patterns.structural.bridge;

import pl.sda.patterns.structural.bridge.color.Color;

public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color: ");
        super.applyColor();
    }

}
