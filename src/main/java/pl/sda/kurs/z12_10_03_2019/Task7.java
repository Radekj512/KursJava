package pl.sda.kurs.z12_10_03_2019;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// NIE DA RADY, BO TRZEBA USTWIC CYFRY I ZNAKI ODPOWIEDNIO

// CHYBA ZE STREAM

public class Task7 {
    public static void main(String[] args) {

        String rownanie = "2*2+2*2+2-5+5+4*4";

        System.out.println(Arrays.stream(rownanie.split("\\+"))
                .map(x -> Arrays.stream(x.split("\\*")))
                    .map(x -> x.map(Integer::valueOf).reduce((a, b) -> (a * b)).get())
                .reduce((x, y) -> (x + y))
                .get());


    }
}
