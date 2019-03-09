package pl.sda.kurs.z11_09_03_2019.lambdas;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Functional {


    /**
     * Obliczyć kwadraty elementów wejściowej listy.
     */
    public List<Integer> squares(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }

    /**
     * Zwrócić tylko parzyste liczby.
     */
    public List<Integer> even(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

    }

    /**
     * Policzyć liczby nieparzyste.
     */
    public Long countOdd(List<Integer> list) {
        return list.stream().filter(x -> x % 2 != 0).count();
    }

    /**
     * Zwrócić najmniejszą liczbę z listy.
     */
    public Integer smallest(List<Integer> list) {
        return list.stream().min((x, y) -> x.compareTo(y)).get();
    }

    /**
     * Zwrócić średni arytmetyczna liczb z listy.
     */
    public Integer avarage(List<Integer> list) {
        return list.stream()
                .reduce((a, b) -> (a + b))
                .get() / list.size();
    }

    /**
     * Zwrócić sumę kwadratów liczb z listy.
     */
    public Integer sumOfSquares(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .reduce((a, b) -> (a + b))
                .get();
    }

    /**
     * Zwrócić sumę modułów liczb z listy.
     */
    public Integer sumOfAbs(List<Integer> list) {
        return list.stream()
                .map(x -> Math.abs(x))
                .reduce((a, b) -> (a + b))
                .get();
    }

    /**
     * Z zadanego stringa usunać, zadana literę.
     */
    public String removeLetter(String input, String letterToRemove) {
        return Stream.of(input)
                .map(line -> line.toLowerCase())
                .map(line -> line.replaceAll(letterToRemove, ""))
                .collect(Collectors.joining(""));
    }

    /**
     * Z zadanego zdania usunać wyrazy o określonej długości.
     */
    public String removeWordOfLength(String input, int length) {
        return Stream.of(input)
                .map(x -> x.split(" "))
                .filter(x -> x.length != 3)
                .collect(Collectors.joining());



    }

    /**
     * Z zadanego zdania usunać liczby.
     */
    public String removeNumbers(String input) {
        return Stream.of(input)
                .map(line -> line.replaceAll("\\d", ""))
                .collect(Collectors.joining(""));
    }


}
