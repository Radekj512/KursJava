package pl.sda.kurs.z8_17_02_2019.lambda_and_stream.Lambdas.task1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src", "main", "resources", "people.txt");
        PersonMenager pm = new PersonMenager();

        pm.load(path);
        System.out.println(pm.getPersonList());
    }
}
