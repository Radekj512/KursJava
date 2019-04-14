package pl.sda.patterns.behavioral.strategy;

import java.util.List;

public class CashPaymentStrategy implements PaymentStrategy {

    private static void payFor(Item item){
        System.out.println(item + " paid by cash.");
    }

    @Override
    public void pay(List<Item> items) {
        items.forEach(CashPaymentStrategy::payFor);
    }
}
