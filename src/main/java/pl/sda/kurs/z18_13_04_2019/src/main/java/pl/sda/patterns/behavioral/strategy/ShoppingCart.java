package pl.sda.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

//TODO 1. Calculate the total price.
//TODO 2. List names of all items.
//TODO 3. Group items by category.
//TODO 4. Make a possibility to pay by cash.
//TODO 5. Make a possibility to pay by debit card.
//TODO 6. Make a possibility to pay by credit card.
//TODO 7. Make a possibility to pay by bitcoin.
//TODO 8. Make a possibility to "pay in kind".
public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.removeItem(item);
    }
}
