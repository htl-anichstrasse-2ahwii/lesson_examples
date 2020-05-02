package org.htl.lesson_examples.interfaces.term;

public class ZahlTerm implements Term {

	private double zahl;

	public ZahlTerm(double zahl) {
		this.zahl = zahl;
	}

	public double loese() {
		return zahl;
	}

	@Override
	public String toString() {
		return Double.toString(loese());
	}

}
