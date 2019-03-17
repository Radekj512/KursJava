package pl.sda.kurs.z14_17_03_2019.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bank {
    private String name;
    private Map<Integer, Person> accountList = new HashMap<>();

    public Bank(){
        this.name = "Domyslny bank";
    }
    public Bank(String name) {
        this.name = name;
    }
    public void addToList(Person person){
        accountList.put(person.getAccountNumber(), person);
    }
    public void newClient(String name, String lastName){
        Person temp = new Person(name,lastName);
        accountList.put(temp.getAccountNumber(), temp);
    }


    public String getName() {
        return name;
    }
    public void printClients(){
        for (Map.Entry kv: accountList.entrySet()){
            Person tmp = (Person)kv.getValue();
            System.out.println(tmp.toString());
            System.out.println();
        }
    }

    public void addCash(int accountNumber, int ammount){
        Set<Integer> listOfAccountNumbers = accountList.keySet();
        if (listOfAccountNumbers.contains(accountNumber)){
            accountList.get(accountNumber).addAmmountOfMoney(ammount);
            System.out.println("Dodano pieniadze do konta");
        }else{
            System.out.println("Brak podanego numeru konta z bazie");
        }
    }
    public void withdraw(){}
}
