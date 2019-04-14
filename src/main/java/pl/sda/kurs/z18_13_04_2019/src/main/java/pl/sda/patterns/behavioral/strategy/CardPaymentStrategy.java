package pl.sda.patterns.behavioral.strategy;

import java.util.List;

public class CardPaymentStrategy implements PaymentStrategy {
    private static void payFor(Item item){
        System.out.println(item + " paid by card.");
    }

    @Override
    public void pay(List<Item> items) {
        items.forEach(CardPaymentStrategy::payFor);
    }
}
