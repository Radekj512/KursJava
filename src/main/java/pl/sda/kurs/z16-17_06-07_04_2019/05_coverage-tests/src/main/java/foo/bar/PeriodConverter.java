package foo.bar;

import java.time.Period;

public class PeriodConverter {
    Period period;

    public PeriodConverter(Period period) {
        this.period = period;
    }

    public int getDays() {
        int years = period.getYears() * 365;
        int months = period.getMonths() * 30;
        int days = period.getDays();
        int numberOfdays = years + months + days;
        return numberOfdays;
    }

    public int getMonths() {
        int years = period.getYears() * 12;
        int months = period.getMonths();
        int days = period.getDays() / 30;
        return years + months + days;
    }

    public int getYears() {
        int years = period.getYears();
        int months = period.getMonths() / 12;
        int days = period.getDays() / 365;
        return years + months + days;
    }
}
