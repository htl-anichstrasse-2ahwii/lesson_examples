package org.htl.lesson_examples.abstrakte_klassen;

public class Kreis extends Figur implements Comparable<Kreis> {
	private double radius;
	
	public Kreis(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	@Override
	double umfang() {
		return 2*radius*Math.PI;
	}

	@Override
	double flaeche() {
		return radius*radius*Math.PI;
	}

	@Override
	public int compareTo(Kreis k) {
		return (int)(radius - k.getRadius());
	}
}
