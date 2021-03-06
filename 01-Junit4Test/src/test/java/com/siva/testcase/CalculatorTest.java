package com.siva.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.siva.logic.Calculator;

public class CalculatorTest {

	private static Calculator calculator = null;

	@BeforeClass
	public static void init() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
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

	@AfterClass
	public static void destroy() {
		calculator = null;

	}

}
