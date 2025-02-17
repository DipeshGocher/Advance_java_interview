package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void setupAll() {
		System.out.println(" Initialize shared resources.");
		// Initialize the Calculator object, which is shared across tests
		calculator = new Calculator();
	}

	@Before
	public void setup() {
		System.out.println("NExt Test");
	}

	// Test for addition
	@Test
	public void testAdd() {
		int result = calculator.add(10, 5);
		assertEquals(15, result);
	}

	// Test for subtraction
	@Test
	public void testSubtract() {
		int result = calculator.subtract(10, 5);
		assertEquals(5, result);
	}

	// Test for multiplication
	@Test
	public void testMultiply() {
		int result = calculator.multiply(10, 5);
		assertEquals(50, result);
	}

	@After
	public void tearDownEach() {
		System.out.println("after");

	}

	@AfterClass
	public static void tearDownAll() {
		System.out.println("after class");
		calculator = null;
	}
}

