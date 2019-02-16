package pl.sda.kurs.z6_10_02_2019.homework.task1;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Map;

public class KalendarzAlergikow {

    private Map<String, ZakresDat>alergeny =new HashMap<>();

    public void add(String n, ZakresDat z) {
        alergeny.put(n, z);
    }

    public void wypiszAlergeny() {
        for (Map.Entry<String, ZakresDat> kv : alergeny.entrySet()) {
            System.out.println(kv.getKey() + " pyli " + kv.getValue());
        }
    }

    public void wypiszAlergeny(int miesiac) {
        System.out.print("W podanym miesiącu pyli: ");
        for (Map.Entry<String, ZakresDat> kv : alergeny.entrySet()) {
            if (kv.getValue().getDataOd().isBefore(LocalDate.now().withMonth(miesiac)) && kv.getValue().getDataDo().isAfter(LocalDate.now().withMonth(miesiac))) {
                System.out.print(kv.getKey() + "\t");
            }
        }
    }
}
