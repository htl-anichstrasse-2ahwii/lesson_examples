package org.htl.lesson_examples.inheritance;

public class FahrzeugMitRaedern extends Fahrzeug  {
	private int anzRaeder;

	public FahrzeugMitRaedern(String farbe, double geschwindigkeit, int anzRaeder) {
		super(farbe, geschwindigkeit);
		this.anzRaeder = anzRaeder;
	}
	
	/**
	 * Diese Methode gibt es nur in dieser Klasse (und in den Unterklassen)
	 * Deshalb muss der statische Typ FahrzeugmitRaedern oder eine Unterklasse davon sein, damit man diese aufrufen kann
	 */
	public void platten()
	{
		System.out.println("Ojee..ein Platten!!!");
	}
	
	/**
	 * Durch die Einführung von toString wird diese Methode dann überflüssig sein
	 */
	@Override
	public void ausgabe() {
		super.ausgabe();
		System.out.printf("Anz Raeder : %d \n", anzRaeder);
	}
	
	public int getAnzRaeder() {
		return anzRaeder;
	}

	public void setAnzRaeder(int anzRaeder) {
		this.anzRaeder = anzRaeder;
	}

	/**
	 * Zusätzlich zur Fahrzeug-Information wird noch die Anzahl der Raeder ausgegeben
	 */
	@Override
	public String toString() {
		return super.toString() + "Anz.Räder: " + anzRaeder;
	}
	
	/**
	 * Vergleichskriterium wird noch um die Fahrzeuge mit Rädern erweitert
	 */
	@Override
	public boolean equals(Object obj) {
		FahrzeugMitRaedern f = (FahrzeugMitRaedern)obj;
		return super.equals(obj) && anzRaeder == f.getAnzRaeder();
	}
}
