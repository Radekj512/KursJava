package pl.sda.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static java.math.BigDecimal.*;

class ShoppingCartTest {
    @Test
    void ShouldPayUsingDifferentPaymentMethods() {
        //given
        List<Item> food = of(new Item("corn", ONE, "food"),
                new Item("carrot", ONE, "food"),
                new Item("apple", ONE, "food")
        );
        Item bike = new Item("bike", ONE, "sport");
        Item gold = new Item("gold", TEN, "items");
        Item love = new Item("love", ZERO, "feelings");
        //TODO add items to shopping cart
        //TODO try to pay using different type of money

    }
}