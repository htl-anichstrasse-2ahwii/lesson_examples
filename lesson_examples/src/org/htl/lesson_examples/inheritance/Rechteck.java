package org.htl.lesson_examples.inheritance;

public class Rechteck extends Figur {

	private double l, b;
	
	public Rechteck(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double flaeche() {
		return l*b;
	}

	@Override
	public double umfang() {
		return 2*(l+b);
	}

	@Override
	public String toString() {
		return super.toString() + "Länge:" + l + " Breite:" + b;
	}
}
