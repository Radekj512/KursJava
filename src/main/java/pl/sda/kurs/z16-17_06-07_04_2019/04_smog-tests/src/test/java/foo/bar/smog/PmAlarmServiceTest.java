package foo.bar.smog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PmAlarmServiceTest {

    @Test
    void shouldReturnNoneForMeasurement_10() {
        PmAlarmService service = new PmAlarmService();
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.POLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_201() {
        PmAlarmService service = new PmAlarmService();
        assertEquals(AlarmLevel.INFO, service.getAlarmMessage(201, Country.POLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_350() {
        PmAlarmService service = new PmAlarmService();
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(301, Country.POLAND));
    }
}
