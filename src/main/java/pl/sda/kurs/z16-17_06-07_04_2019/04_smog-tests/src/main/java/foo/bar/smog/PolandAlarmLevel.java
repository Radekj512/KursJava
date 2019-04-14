package foo.bar.smog;

public class PolandAlarmLevel implements CountryAlarmLevel {
    private final int INFO = 200;
    private final int WARNING = 300;

    private int pmLevel;

    public PolandAlarmLevel(int pmLevel) {
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
