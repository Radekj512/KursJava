package pl.sda.kurs.z14_17_03_2019.task1;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private Map<String, Double> productsList = new HashMap<>();

    public Shop(List<Product> productsList) {
        for (Product p : productsList) {
            this.productsList.put(p.getName(),p.getValue());
        }
    }

    public Map<String, Double> getProductsList() {
        return productsList;
    }
}
