package org.htl.lesson_examples.abstrakte_klassen;

public class Rechteck extends Figur{
	private double laenge;
	private double breite;
	

	public Rechteck(double laenge, double breite) {
		super();
		this.laenge = laenge;
		this.breite = breite;
	}

	@Override
	double umfang() {
		return 2*(laenge + breite);
	}

	@Override
	double flaeche() {
		return laenge*breite;
	}
}
