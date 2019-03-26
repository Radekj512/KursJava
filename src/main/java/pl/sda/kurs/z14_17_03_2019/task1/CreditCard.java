package pl.sda.kurs.z14_17_03_2019.task1;

import java.math.BigDecimal;

public class CreditCard implements BankCard {
    @Override
    public void pay(BigDecimal ammount) {
        System.out.println("Zaplacono " + ammount.doubleValue() + ".");
    }

    @Override
    public void withdraw(BigDecimal ammount) {
        System.out.println("Wypłacono " + ammount.doubleValue() + ".");

    }

    @Override
    public String toString() {
        return "CreditCard{}";
    }
}
