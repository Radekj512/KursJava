package foo.bar.smog;

public class ItalyAlarmLevel implements CountryAlarmLevel {
    private final int INFO = 50;
    private final int WARNING = 75;

    private int pmLevel;

    public ItalyAlarmLevel(int pmLevel) {
        this.pmLevel = pmLevel;
    }

    @Override
    public AlarmLevel getAlarmLevel() {
        if(pmLevel < INFO){
            return AlarmLevel.NONE;
        }
        if (pmLevel < WARNING){
            return AlarmLevel.INFO;
        }
        return AlarmLevel.WARNING;
    }
}
