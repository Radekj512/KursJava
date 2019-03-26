package pl.sda.kurs.z14_17_03_2019.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Account extends Bank{
    private BigDecimal balance;
    private int dailyLimit;

    private final int accountNumber;
    private String bankName;

    public Account() {
        bankName = super.getName();
        this.balance = BigDecimal.valueOf(0);
        this.dailyLimit = 100;
        this.accountNumber = new Random().nextInt(9000)+1000;
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, RoundingMode.HALF_UP);
    }

    public void setBalance(double balance) {
        BigDecimal bd = new BigDecimal(balance);
        this.balance = this.balance.add(bd);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", dailyLimit=" + dailyLimit +
                ", accountNumber=" + accountNumber +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
