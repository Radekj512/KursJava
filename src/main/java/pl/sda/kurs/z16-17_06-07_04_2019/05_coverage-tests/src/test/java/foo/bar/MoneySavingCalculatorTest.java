package foo.bar;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneySavingCalculatorTest {

    MoneySavingCalculator calc = new MoneySavingCalculator();

    @Test
    @Description("During period of 1 year, when saving is 1000 once a YEAR, total savings should be 1000")
    void saveEachYearDuringYear1000pln() {
        assertEquals(
                BigDecimal.valueOf(1000),
                calc.calculateSavings(SavingFrequency.ONCE_A_YEAR,
                        BigDecimal.valueOf(1000), Period.ofYears(1))
        );
    }
    @Test
    @Description("During one year, when saving is 1 everyday, total savings should be 365")
    void saveEachDayDuringYear1pln(){
        assertEquals(BigDecimal.valueOf(365), calc.calculateSavings(SavingFrequency.EACH_DAY, BigDecimal.valueOf(1), Period.ofYears(1)));
    }

    @Test
    @Description("During one year, when saving is 10 everyweek, total savings should be 520")
    void saveEachWeekDuringYear10pln(){
        assertEquals(BigDecimal.valueOf(520), calc.calculateSavings(SavingFrequency.EACH_WEEK, BigDecimal.valueOf(10), Period.ofYears(1)));
    }
}
