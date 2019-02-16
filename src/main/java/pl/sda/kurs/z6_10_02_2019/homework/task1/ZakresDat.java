package pl.sda.kurs.z6_10_02_2019.homework.task1;

import java.time.LocalDate;
import java.time.Month;

public class ZakresDat {
    private LocalDate dataOd;
    private LocalDate dataDo;

    public ZakresDat(LocalDate dataOd, LocalDate dataDo) {
        this.dataOd = dataOd;
        this.dataDo = dataDo;
    }

    @Override
    public String toString() {
        return "od "+dataOd.getMonth() + " do " +dataDo.getMonth();
    }

    public LocalDate getDataOd() {
        return dataOd;
    }

    public LocalDate getDataDo() {
        return dataDo;
    }
}
