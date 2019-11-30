package com.example.com.util;

import java.math.BigDecimal;

public class BasicArithmeticOperations {
    static public BigDecimal plus(String a, String b) {
        return plus(new BigDecimal(a), new BigDecimal(b));
    }

    static private BigDecimal plus(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
