package foo.bar;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Period;

public class MoneySavingCalculatorTest {

    MoneySavingCalculator calc = new MoneySavingCalculator();

    @Test
    @Description("During period of 1 year, when saving is 1000 once a YEAR, total savings should be 1000")
    void saveEachYearDuringYear1000pln() {
        Assertions.assertEquals(
                BigDecimal.valueOf(1000),
                calc.calculateSavings(SavingFrequency.ONCE_A_YEAR,
                        BigDecimal.valueOf(1000), Period.ofYears(1))
        );
    }
}
