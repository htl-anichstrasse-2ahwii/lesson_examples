package org.htl.lesson_examples.interfaces;

public class BruchTest {

	public static void main(String[] args) {
		Bruch t1 = new Bruch(1, 2);
		Bruch t2 = new Bruch(1, 4);

		int a = t1.compareTo(t2);
		double b = (double) a / 1000;
		System.out.println(b);
	}
}
