package org.htl.lesson_examples.inheritance;

public class Auto extends FahrzeugMitRaedern {
	private int anzTueren;

	public Auto(String farbe, double geschwindigkeit, int anzRaeder, int anzTueren) {
		super(farbe, geschwindigkeit, anzRaeder);
		this.anzTueren = anzTueren;
	}
	
	public void oelwechsel()
	{
		System.out.println("Öl wird gewechselt!!!");
	}
	
	@Override
	public void ausgabe() {
		super.ausgabe();
		System.out.printf("Anzahl Tueren: %d \n", anzTueren);
	}
}
