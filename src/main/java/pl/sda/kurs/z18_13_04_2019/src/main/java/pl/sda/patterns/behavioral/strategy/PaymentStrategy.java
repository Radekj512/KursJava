package pl.sda.patterns.behavioral.strategy;

import java.util.List;

public interface PaymentStrategy {
    public void pay(List<Item> items);
}
