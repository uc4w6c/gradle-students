package com.example.com.util;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BasicArithmeticOperationsTest {
    @Test
    public void shouldReturnTheSumOfNumbersWhichAreNumericString() {
        assertEquals(new BigDecimal(2), BasicArithmeticOperations.plus("1", "1"));
    }
}
