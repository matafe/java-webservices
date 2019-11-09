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
@WebService(endpointInterface = "com.matafe.calculator.Calculator", serviceName = "CalculatorService", portName = "CalculatorPort")
public class CalculatorImpl implements Calculator {

    private static final Logger LOG = LogManager.getLogger(CalculatorImpl.class);

    @Override
    public int sum(int a, int b) {
	LOG.debug("Sum {} + {} = {}");
	int r = a + b;
	// System.out.println(a + " + " + b + " = " + r);
	LOG.debug("Sum {} + {} = {}", a, b, r);
	return r;
    }

    @Override
    public double division(int a, int b) {
	double result = a / b;
	return result;
    }

}