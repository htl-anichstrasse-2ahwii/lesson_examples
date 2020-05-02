package org.htl.lesson_examples.interfaces;

public class UhrzeitTest {

	public static void main(String[] args) {
		Uhrzeit t1 = new Uhrzeit(3, 15, 3);
		Uhrzeit t2 = new Uhrzeit(1, 16, 6);

		int unt = t1.compareTo(t2);
		System.out.println(unt + " Sekunden unterschied.");
	}

}
