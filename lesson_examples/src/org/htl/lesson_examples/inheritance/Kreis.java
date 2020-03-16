package org.htl.lesson_examples.inheritance;

public class Kreis extends Figur {

	private double r;

	public Kreis(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double flaeche() {
		return Math.pow(r, 2) * Math.PI;
	}

	@Override
	public double umfang() {
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "Radius:" + r;
	}
}
