package pl.sda.patterns.structural.bridge;

import pl.sda.patterns.structural.bridge.color.Color;

//TODO write junits to bridge package
//TODO find the way to check if color has been filled correctly (you cannot make assert on sout)
public abstract class Shape {
    protected Color color;

    protected Shape(Color c) {
        this.color = c;
    }

    protected void applyColor() {
        this.color.applyColor();
    }
}
