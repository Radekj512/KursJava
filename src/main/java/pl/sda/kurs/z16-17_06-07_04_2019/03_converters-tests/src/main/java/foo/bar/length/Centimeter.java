package foo.bar.length;

import java.math.BigDecimal;

public class Centimeter implements LengthUnit{

    private final BigDecimal value;

    public Centimeter(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 0) {
            throw new IllegalArgumentException("Weight can't be negative!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Inch toInches() {
        return new Inch(value.divide(Inch.INCH_TO_CENTIMETER, SCALE, ROUNDING_MODE));
    }
}
