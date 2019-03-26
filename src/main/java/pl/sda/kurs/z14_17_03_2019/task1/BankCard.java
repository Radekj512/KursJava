package pl.sda.kurs.z14_17_03_2019.task1;

import java.math.BigDecimal;

public interface BankCard {
    public void pay(BigDecimal ammount);
    public void withdraw(BigDecimal ammount);
}
