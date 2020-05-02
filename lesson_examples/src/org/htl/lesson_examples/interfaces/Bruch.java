package org.htl.lesson_examples.interfaces;

public class Bruch implements Comparable<Bruch> {

	private double zaehler;
	private double nenner;

	public double getZähler() {
		return zaehler;
	}

	public double getNenner() {
		return nenner;
	}

	public Bruch(double zähler, double nenner) {
		this.zaehler = zähler;
		this.nenner = nenner;
	}

	public double ergeb() {
		return zaehler / nenner;
	}

	public int compareTo(Bruch o) {
		return (int) ((ergeb() - o.ergeb()) * 1000);
	}
}
