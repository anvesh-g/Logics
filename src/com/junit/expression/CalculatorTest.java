package com.junit.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void evaluateExpression(){
        Calculator cal = new Calculator();
        int sum=cal.evaluate("1+2+3");
        assertEquals(6,sum);
    }
}
