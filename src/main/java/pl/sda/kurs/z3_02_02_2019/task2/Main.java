package pl.sda.kurs.z3_02_02_2019.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pies> psy = new ArrayList();
        psy.add(new Sznaucer());
        psy.add(new Pudel());
        psy.add(new Owczarek());
        psy.add(new Pies("kundel"));

        for (int i = 0; i < psy.size(); i++) {
            System.out.println(psy.get(i).szczekaj());
        }
    }
}
