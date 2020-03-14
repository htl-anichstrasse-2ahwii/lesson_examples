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

}
