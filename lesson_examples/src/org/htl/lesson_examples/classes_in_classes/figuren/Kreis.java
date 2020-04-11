package org.htl.lesson_examples.classes_in_classes.figuren;

public class Kreis {
	private double radius;

	public Kreis(int radius) {
		this.radius = radius;
	}

	public double flaeche() {
		return radius * radius * Math.PI;
	}

	public double umfang() {
		return 2 * radius * Math.PI;
	}

	public void ausgabe() {
		System.out.printf("Der Umfang beträgt %s\nDie Fläche beträgt %s\n", umfang(), flaeche());
		System.out.println();
	}
}
