package org.htl.lesson_examples.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author albert
 * Test Class for class <b>CalculatorTest</b>
 */
class CalculatorTest {

	@Test
	void testAdd() {
		int res = Calculator.add(10, 20);
		assertEquals(30, res);
	}

	void testMax2()
	{
		int m1 = Calculator.max(10, 20);
		assertEquals(30, m1);
		
		int m2 = Calculator.max(10, -20);
		assertEquals(10, m2);
	}
}
