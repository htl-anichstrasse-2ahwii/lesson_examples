package org.htl.lesson_examples.classes_in_classes.figuren;

public class Quadrat {
	private double laenge;

	public Quadrat(int laenge) {
		this.laenge = laenge;
	}

	public double umfang() {
		return 4 * laenge;
	}

	public double flaeche() {
		return laenge * laenge;
	}

	public void ausgabe() {
		System.out.printf("Der Umfang beträgt %s\nDie Fläche beträgt %s\n", umfang(), flaeche());
		System.out.println();
	}
}
