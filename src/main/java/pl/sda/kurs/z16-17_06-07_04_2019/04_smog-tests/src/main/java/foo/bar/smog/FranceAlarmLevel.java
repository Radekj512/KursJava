package foo.bar.smog;

public class FranceAlarmLevel implements CountryAlarmLevel {
    private final int WARNING = 80;

    private int pmLevel;

    public FranceAlarmLevel(int pmLevel) {
        this.pmLevel = pmLevel;
    }

    @Override
    public AlarmLevel getAlarmLevel() {
        if(pmLevel < WARNING){
            return AlarmLevel.NONE;
        }
        return AlarmLevel.WARNING;
    }
}
