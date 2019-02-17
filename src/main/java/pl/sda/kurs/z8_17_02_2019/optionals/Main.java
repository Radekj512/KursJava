package pl.sda.kurs.z8_17_02_2019.optionals;

import pl.sda.kurs.z8_17_02_2019.lambda_and_stream.Lambdas.task1.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person janKowalski = new Person("Jan", "Kowalski");
        Person nullPerson = null;

        // nullPerson.getName(); // wywali program

        if (nullPerson != null) {
            nullPerson.toString();
        }

        Optional<Person> optionalPerson = Optional.ofNullable(nullPerson);
        Person p1 = optionalPerson.orElse(new Person("Domyslna", "Osoba"));
        System.out.println(p1);

        List<String> hello = methodThatReturnOptional()
                .map(e -> e.split(" "))
                .map(e -> Arrays.asList(e))
                .filter(words -> words.contains("l"))
                //.get());
                .orElse(new ArrayList<>());
        System.out.println(hello);

        List<String> hello2 = methodThatReturnOptional()
                .map(e -> e.split(" "))
                .map(e -> Arrays.asList(e))
                .map(e->e.stream()
                        .filter(w->w.contains("lo"))
                        .collect(Collectors.toList()))
               // .filter()
                //.get());
                .orElse(new ArrayList<>());
        System.out.println(hello2);


//        Optional.of(null); // nie akceptuje wartosci null
        Optional.ofNullable(null); // akceptuje null
    }

    public static Optional<String> methodThatReturnOptional() {
        return Optional.ofNullable("Hello World");
    }
}
