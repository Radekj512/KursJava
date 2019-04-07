package foo.bar.smog;

public class PmAlarmService {

    public PmAlarmService() { }

    public AlarmLevel getAlarmMessage(int measurement, Country country) {
        switch (country) {
            case ITALY:
                break;
            case FINLAND:
                break;
            case FRANCE:
                break;
            case POLAND:
                if (measurement > 0 && measurement < 200 ) {
                    return AlarmLevel.NONE;
                } else if(measurement < 300) {
                    return AlarmLevel.INFO;
                } else {
                    return AlarmLevel.WARNING;
                }
        }
        return AlarmLevel.NONE;
    }

}
