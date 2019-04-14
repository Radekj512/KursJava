package foo.bar;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest(name = "During period of {3} years, when saving is {2} {1} should be {0}")
    @CsvSource({
            "1000.00, ONCE_A_YEAR, 1000.00, 1",
            "3000.00, ONCE_A_YEAR, 1000.00, 3"
    })
    void savingTestOnceAYear(double expectedValue, SavingFrequency savingFrequency, double singleAmmount, int years){
        assertEquals(
                BigDecimal.valueOf(expectedValue),
                calc.calculateSavings(savingFrequency,
                        BigDecimal.valueOf(singleAmmount), Period.ofYears(years))
        );
    }
    @ParameterizedTest(name = "During period of {3} days, when saving is {2} {1} should be {0}")
    @CsvSource({
            "200, EACH_DAY, 1, 200",
            "10, EACH_DAY, 0.5, 20"
    })
    void savingTestEachDay(double expectedValue, SavingFrequency savingFrequency, double singleAmmount, int years){
        assertEquals(
                BigDecimal.valueOf(expectedValue),
                calc.calculateSavings(savingFrequency,
                        BigDecimal.valueOf(singleAmmount), Period.ofDays(years))
        );
    }
}
