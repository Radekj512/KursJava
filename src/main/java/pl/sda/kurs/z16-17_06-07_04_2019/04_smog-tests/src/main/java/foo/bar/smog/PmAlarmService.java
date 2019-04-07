package foo.bar.smog;

public class PmAlarmService {

    public PmAlarmService() { }

    public AlarmLevel getAlarmMessage(int measurement, Country country) {
        AlarmLevel alarmLevel;
        switch (country) {
            case ITALY:
                alarmLevel = new ItalyAlarmLevel(measurement).getAlarmLevel();
                return alarmLevel;
            case FINLAND:
                alarmLevel = new FinlandAlarmLevel(measurement).getAlarmLevel();
                return alarmLevel;
            case FRANCE:
                alarmLevel = new FranceAlarmLevel(measurement).getAlarmLevel();
                return alarmLevel;
            case POLAND:
                alarmLevel = new PolandAlarmLevel(measurement).getAlarmLevel();
                return alarmLevel;

        }
        return AlarmLevel.NONE;
    }

}
