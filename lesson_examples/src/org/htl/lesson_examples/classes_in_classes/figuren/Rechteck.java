package org.htl.lesson_examples.classes_in_classes.figuren;

public class Rechteck {
	private double laenge;
	private double breite;

	public Rechteck(int laenge, int breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public double flaeche() {
		return laenge * breite;

	}

	public double umfang() {
		return 2 * (laenge + breite);

	}

	public void ausgabe() {
		System.out.printf("Der Umfang beträgt %s\nDie Fläche beträgt %s\n", umfang(), flaeche());
		System.out.println();
	}
}
