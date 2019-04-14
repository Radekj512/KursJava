package pl.sda.patterns.structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseSandwichTest {

    @Test
    void getPrice() {
    }

    @Test
    void getDesc() {
        WhiteBreadSandwich w = new WhiteBreadSandwich("buleczka");
        CheeseSandwich cs = new CheeseSandwich(w);
        HamSandwich hs = new HamSandwich(cs);
        //System.out.println(cs.getDesc() + cs.getPrice());
        //System.out.println(hs.getDesc() + hs.getPrice());
        Assertions.assertEquals("buleczka with cheese with ham", hs.getDesc());
    }
}