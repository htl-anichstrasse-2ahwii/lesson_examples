package org.htl.lesson_examples.interfaces.term;

public class FakTerm implements Term {
	private Term t1;

	public FakTerm(Term t1) {
		this.t1 = t1;

	}

	public double loese() {
		double a = 1;
		for (int i = 1; i <= t1.loese(); i++) {
			a = a * i;
		}
		return a;
	}

	@Override
	public String toString() {
		String s = "Fakult�t von " + t1 + " = " + Double.toString(loese());
		return s;
	}
}
