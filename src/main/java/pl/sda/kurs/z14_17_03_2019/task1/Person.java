package pl.sda.kurs.z14_17_03_2019.task1;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class Person {
    private static int id;
    private final int ID;
    private String name;
    private String lastName;
    private Account accountNumber;
    private CreditCard bankCard;

    public Person(String name, String lastName) {
        ID = ++id;
        this.name = name;
        this.lastName = lastName;
        accountNumber = new Account();
        bankCard = new CreditCard();

    }

    public void addAmmountOfMoney(double ammount) {
        accountNumber.setBalance(ammount);
    }

    public int getId() {
        return ID;
    }

    public BigDecimal getBalance() {
        return accountNumber.getBalance();
    }

    public void buy(List<String> productsToBuy, Shop from) {
        //List<Product> productList = from.getProductsList();
        Set<String> kSet = from.getProductsList().keySet();
        BigDecimal finalPrice = new BigDecimal(0);


        for (String p : productsToBuy) {
            if (kSet.contains(p)) {
               finalPrice =  finalPrice.add(BigDecimal.valueOf(from.getProductsList().get(p)));
            }
        }
        if (accountNumber.getBalance().compareTo(finalPrice) < 0) {
            System.out.println("Masz za malo pieniedzy");
        } else {
            bankCard.pay(finalPrice);
            accountNumber.setBalance(finalPrice.doubleValue()*(-1));
        }

    }

    public int getAccountNumber() {
        return accountNumber.getAccountNumber();
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                ", bankCard=" + bankCard +
                '}';
    }
}
