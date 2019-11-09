package com.matafe.calculator.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.matafe.calculator.Calculator;

/**
 * Unit Test for Calculator Implementation.
 * 
 * @author matafe@gmail.com
 */
public class CalculatorImplTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
	this.calculator = new CalculatorImpl();
    }

    @Test
    public void testSum() {
	assertEquals(3, calculator.sum(1, 2));
    }

    @Test
    public void testDivide() {
	assertThrows(ArithmeticException.class, () -> {
	    calculator.division(5, 0);
	});
    }
}
