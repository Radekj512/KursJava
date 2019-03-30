package pl.sda.kurs.z15_30_03_2019.IO.data;

import com.google.gson.Gson;
import pl.sda.kurs.z15_30_03_2019.OOP.util.Creator;

public class GsonTest {
    public static void main(String[] args) {
        Gson gson = new Gson();

        System.out.println(gson.toJson(Creator.getWorld()));
    }
}
