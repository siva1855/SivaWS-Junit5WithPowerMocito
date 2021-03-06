package com.siva.testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.siva.logic.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		Integer actualResult = calculator.add(2, 3);
		Integer expectedResult = 5;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testMultiplay() {
		Integer actualResult = Calculator.multiply(5, 2);
		Integer expectedResult = 10;
		assertEquals(actualResult, expectedResult);
	}

}
