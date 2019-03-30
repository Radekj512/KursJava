package pl.sda.kurs.z15_30_03_2019.Generics;

import java.util.List;
import java.util.function.Function;

public class GenericsExample {
    public static void main(String[] args) {


        Function<? extends List, ? super Number> mf = x -> x.size();

        Integer[] intArr = {1,2,3,4,5,6};
        ArrayUtils.printArray(intArr);

    }


}
