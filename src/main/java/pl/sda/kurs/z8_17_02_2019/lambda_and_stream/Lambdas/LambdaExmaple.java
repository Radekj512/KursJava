package pl.sda.kurs.z8_17_02_2019.lambda_and_stream.Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExmaple {
    public Function<Integer, Integer> power(){//w nawiascie <co przyjnuje, co zwraca>
        return x-> x*x;
    }
    public BiFunction<Integer, Integer, Integer> sum(){ // <typ pierwszego parametru, typ drugiego parametru, typ zwracany>
        return (x, y) -> x+y;
    }


}
