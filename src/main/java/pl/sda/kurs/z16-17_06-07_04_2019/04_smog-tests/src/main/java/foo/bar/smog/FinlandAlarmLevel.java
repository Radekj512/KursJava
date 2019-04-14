package foo.bar.smog;

public class FinlandAlarmLevel implements CountryAlarmLevel {
    private final int INFO = 50;

    private int pmLevel;

    public FinlandAlarmLevel(int pmLevel) {
        this.pmLevel = pmLevel;
    }

    @Override
    public AlarmLevel getAlarmLevel() {
        if(pmLevel < INFO){
            return AlarmLevel.NONE;
        }
        return AlarmLevel.INFO;
    }
}
