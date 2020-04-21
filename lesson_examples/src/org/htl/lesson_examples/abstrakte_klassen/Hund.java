package org.htl.lesson_examples.abstrakte_klassen;

public class Hund implements Ausgebbar {

	@Override
	public void ausgabe() {
		System.out.println("Wuff!");
	}
}
