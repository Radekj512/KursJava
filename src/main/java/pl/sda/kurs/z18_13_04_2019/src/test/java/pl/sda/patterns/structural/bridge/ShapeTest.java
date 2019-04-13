package pl.sda.patterns.structural.bridge;

import org.junit.jupiter.api.Test;
import pl.sda.patterns.structural.bridge.color.BlueColor;

class ShapeTest {

    @Test
    void shouldCorrectlyFillTheColor() {
        new Diamond(new BlueColor()).applyColor();
    }
}