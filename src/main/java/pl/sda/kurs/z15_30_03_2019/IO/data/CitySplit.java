package pl.sda.kurs.z15_30_03_2019.IO.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CitySplit {
    public static void main(String[] args) throws IOException {
        List<String> cities = new ArrayList<>();

        Path cityList = Paths.get("src","main","java","pl","sda","kurs","z15_30_03_2019","IO","data","cities.txt");
        Path miasta = Paths.get("src","main","java","pl","sda","kurs","z15_30_03_2019","IO","data","miasta.txt");
        Files.lines(cityList)
                .map(x -> x.split(", "))
                .map(arr -> cities.add(arr[0]));
        Files.write(miasta,cities);
    }
}
