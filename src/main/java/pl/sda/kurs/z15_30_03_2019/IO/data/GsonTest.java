package pl.sda.kurs.z15_30_03_2019.IO.data;

import com.google.gson.Gson;
import org.apache.commons.lang3.time.StopWatch;
import pl.sda.kurs.z15_30_03_2019.OOP.util.Creator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class GsonTest {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        StopWatch s = new StopWatch();
        s.start();
        Path worldJson = Paths.get("src", "main", "java", "pl", "sda", "kurs", "z15_30_03_2019", "IO", "data", "world.json");
        Files.write(worldJson, Collections.singleton(gson.toJson(Creator.getWorld())));
        s.stop();
        System.out.println("Zapisano do pliku w " + s.getTime());

    }
}
