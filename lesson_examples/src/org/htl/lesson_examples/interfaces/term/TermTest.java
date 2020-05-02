package org.htl.lesson_examples.interfaces.term;

public class TermTest {

	public static void main(String[] args) {
		ZahlTerm t1 = new ZahlTerm(10);
		ZahlTerm t2 = new ZahlTerm(2);
		ZahlTerm t10 = new ZahlTerm(5);

		String a = t1.toString();
		System.out.println(a);

		AddTerm t3 = new AddTerm(t1, t2);
		System.out.println(t3.toString());

		MultTerm t4 = new MultTerm(t3, t1);
		String s = t4.toString();
		System.out.println(s);

		PowTerm t5 = new PowTerm(t1, t2);
		String b = t5.toString();
		System.out.println(b);

		FakTerm t6 = new FakTerm(t10);
		String c = t6.toString();
		System.out.println(c);

	}

}
