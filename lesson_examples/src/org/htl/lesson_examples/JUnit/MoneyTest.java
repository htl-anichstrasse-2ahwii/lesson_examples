package org.htl.lesson_examples.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testAdd1() {
		Money m1 = new Money(10, "EUR");
		Money m2 = new Money(10, "EUR");

		Money m3 = Money.add(m1, m2);
		assertEquals(new Money(20, "EUR"), m3);
	}

	@Test
	public void testAdd2() {
		System.out.println("testAdd2");
	}
}