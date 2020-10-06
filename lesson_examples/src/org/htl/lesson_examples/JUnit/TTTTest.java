package org.htl.lesson_examples.JUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TTTTest {

	TTT ttt;

	@BeforeEach
	void setUp() throws Exception {
		ttt = new TTT();
		ttt.init();
	}

	@Test
	void testGewonnen() {
		ttt.spielZug(0);
		boolean gew = ttt.gewonnen();
		assertFalse(gew);
		ttt.spielZug(3);
		gew = ttt.gewonnen();
		assertFalse(gew);
		ttt.spielZug(1);
		gew = ttt.gewonnen();
		assertFalse(gew);
		ttt.spielZug(4);
		gew = ttt.gewonnen();
		assertFalse(gew);
		ttt.spielZug(2);
		gew = ttt.gewonnen();
		assertTrue(gew);
	}

	@Test
	void testVoll() {
		ttt.spielZug(0);
		boolean voll = ttt.voll();
		assertFalse(voll);
		ttt.spielZug(1);
		voll = ttt.voll();
		assertFalse(voll);
		ttt.spielZug(2);
		voll = ttt.voll();
		assertFalse(voll);
		assertFalse(voll);
		ttt.spielZug(3);
		voll = ttt.voll();
		assertFalse(voll);
		assertFalse(voll);
		ttt.spielZug(4);
		assertFalse(voll);
		voll = ttt.voll();
		ttt.spielZug(5);
		assertFalse(voll);
		voll = ttt.voll();
		ttt.spielZug(6);
		assertFalse(voll);
		voll = ttt.voll();
		ttt.spielZug(7);
		assertFalse(voll);
		voll = ttt.voll();
		ttt.spielZug(8);
		voll = ttt.voll();
		assertTrue(voll);
	}

}
