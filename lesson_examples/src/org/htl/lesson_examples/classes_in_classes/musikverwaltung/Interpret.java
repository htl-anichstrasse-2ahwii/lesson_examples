package org.htl.lesson_examples.classes_in_classes.musikverwaltung;

public class Interpret {
	private String name;
	private int jahr;

	public Interpret(String name, int jahr) {
		this.name = name;
		this.jahr = jahr;
	}

	public String getName() {
		return name;
	}

	public int getJahr() {
		return jahr;
	}

	public void ausgabe() {
		System.out.printf("Der Interpret lautet '%s'!\nAktiv seit: %d\n", name, jahr);
	}
}
