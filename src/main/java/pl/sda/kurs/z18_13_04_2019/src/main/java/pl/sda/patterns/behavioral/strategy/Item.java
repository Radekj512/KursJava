package pl.sda.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
class Item {
    String name;
    BigDecimal cash;
    String category;
}
