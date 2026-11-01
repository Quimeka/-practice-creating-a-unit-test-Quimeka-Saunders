package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2+3 should equal to 5");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 4);
        assertEquals(0, result, "4-4 should equal 0");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(1, 1);
        assertEquals(1, result, "1/1 should equal 1");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(0,10 );
        assertEquals(0, result, "Dividing zero by a number should equal 0");
    }


}