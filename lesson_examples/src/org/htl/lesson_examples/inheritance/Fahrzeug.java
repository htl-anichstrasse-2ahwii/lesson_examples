package org.htl.lesson_examples.inheritance;

public class Fahrzeug implements Ausgeben, Comparable<Fahrzeug> {
	private String farbe;
	private double geschwindigkeit;
	
	public Fahrzeug(String farbe, double geschwindigkeit) {
		this.farbe = farbe;
		this.geschwindigkeit = geschwindigkeit;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public void ausgabe()
	{
		System.out.printf(toString());
	}
	@Override
	public String toString() {
		return "Farbe: " + farbe +  "Geschwindigkeit:" + geschwindigkeit;
	}
	
	/**
	 * Unser Vergleichskriterium ist jetzt Farbe und Geschwindigkeit
	 * Das wird in den Unterklassen noch genauer spezifiziert, entsprechend welche zusätzlichen Eigenschaften sie haben
	 */
	@Override
	public boolean equals(Object obj) {
		Fahrzeug f = (Fahrzeug)obj;
		
		return farbe.equals(f.getFarbe()) && 
				geschwindigkeit == f.getGeschwindigkeit();
	}

	/**
	 * Das Vergleichskriterium ist jetzt die Geschwindigkeit (auch für alle Unterklassen)
	 */
	@Override
	public int compareTo(Fahrzeug o) {
		return (int)(geschwindigkeit - o.getGeschwindigkeit());
	}
	
}
