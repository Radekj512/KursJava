package pl.sda.kurs.z1_26_01_2019;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("313216851568484321818518648");
        double x = 0.02;
        double y = 0.03;
        System.out.println(x-y);
        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");
        BigDecimal aa = BigDecimal.valueOf(0.02);
        BigDecimal bb = BigDecimal.valueOf(0.03);
        System.out.println(a.subtract(b));
    }
}
