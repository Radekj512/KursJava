package pl.sda.patterns.structural.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.patterns.structural.bridge.color.BlueColor;
import pl.sda.patterns.structural.bridge.color.ColorType;

class ShapeTest {

    @Test
    void shouldCorrectlyFillTheColor() {
        //given
        Shape s = new Diamond(new BlueColor());
        //when
        s.applyColor();
        //then
        Assertions.assertEquals(ColorType.BLUE, s.color.getMyColor());

    }
}