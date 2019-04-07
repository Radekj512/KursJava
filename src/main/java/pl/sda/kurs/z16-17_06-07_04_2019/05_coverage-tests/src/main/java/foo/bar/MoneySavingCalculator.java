package foo.bar;

import java.math.BigDecimal;
import java.time.Period;

public class MoneySavingCalculator {

    public BigDecimal calculateSavings(SavingFrequency frequency, BigDecimal singleAmmount, Period duration) {
        SavingFrequency freq = frequency;
        BigDecimal ammount = new BigDecimal(0);
        switch (freq){

            case EACH_DAY:
                int numberOfDays = new PeriodConverter(duration).getDays();
                for (int i = 0; i < numberOfDays; i++){
                    ammount = ammount.add(singleAmmount);
                }

                break;
            case EACH_WEEK:
                int numberOfWeeks = new PeriodConverter(duration).getDays()/7;
                for (int i = 0; i < numberOfWeeks; i++){
                    ammount = ammount.add(singleAmmount);
                }
                break;
            case EACH_MONTH:
                int numberOfMonths = new PeriodConverter(duration).getMonths();
                for (int i = 0; i < numberOfMonths; i++){
                    ammount = ammount.add(singleAmmount);
                }
                break;
            case EACH_SECOND_DAY:
                int everySecondDay = new PeriodConverter(duration).getDays()/2;
                for (int i = 0; i < everySecondDay; i++){
                    ammount = ammount.add(singleAmmount);
                }
                break;
            case TWICE_A_WEEK:
                int twiceAWeek = new PeriodConverter(duration).getDays()/7*2;
                for (int i = 0; i < twiceAWeek; i++){
                    ammount = ammount.add(singleAmmount);
                }
                break;
            case ONCE_A_YEAR:
                int numberOfYears = new PeriodConverter(duration).getYears();
                for (int i = 0; i < numberOfYears; i++){
                    ammount = ammount.add(singleAmmount);
                }
                break;

        }


        return ammount;
    }
}
