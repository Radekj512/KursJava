package pl.sda.kurs.z5_09_02_2019.przypomnienie.Second;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();

        userList.add(new Employee(3, "pracownik", "pracownik@company.pl"));
        userList.add(new Contractor("Firma1", "kontrakt1", "kontrakt1@firma1.pl"));

        for (User u : userList) {
            System.out.printf("ID: "+ u.getId() + "\tNazwa: " + u.getUserName() + "\tEmail: " + u.getEmail()+"\n");
            //System.out.println(u);
        }
    }
}
