package com.matafe.calculator.impl;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.matafe.calculator.Calculator;

/**
 * Calculator Implementation.
 * 
 * @author matafe@gmail.com
 */
// endpointInterface -> delegate @WebService for the Interface
@WebService(endpointInterface = "com.matafe.calculator.Calculator", serviceName = "CalculatorService", portName = "CalculatorPort", targetNamespace = "http://calculator.matafe.com/")
public class CalculatorImpl implements Calculator {

    private static final Logger LOG = LogManager.getLogger(CalculatorImpl.class);

    @Override
    public int sum(final int a, final int b) {
	final int result = a + b;
	LOG.debug("Sum: ({} + {}) = {}", a, b, result);
	return result;
    }

    @Override
    public double division(final int a, final int b) {
	// week implementation!!!
	// n / 0 -> ArithmeticException
	final double result = a / b;
	LOG.debug("Div: ({} / {}) = {}", a, b, result);
	return result;
    }

}