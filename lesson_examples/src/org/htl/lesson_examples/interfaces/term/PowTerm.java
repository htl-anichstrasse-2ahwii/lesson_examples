package org.htl.lesson_examples.interfaces.term;

public class PowTerm implements Term {

	private Term t1;
	private Term t2;

	public PowTerm(Term t1, Term t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public double loese() {
		return Math.pow(t1.loese(), t2.loese());
	}

	@Override
	public String toString() {
		String s = t1 + " ^ " + t2 + " = " + Double.toString(loese());
		return s;
	}

}
