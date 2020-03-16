package org.htl.lesson_examples.inheritance;

public class Wasserfahrzeug extends Fahrzeug {
	private int anzTurbinen;

	public Wasserfahrzeug(String farbe, double geschwindigkeit, int anzTurbinen) {
		super(farbe, geschwindigkeit);
		this.anzTurbinen = anzTurbinen;
	}
	
	@Override
	public void ausgabe() {
		super.ausgabe();
		System.out.printf("Anzahl Turbinen: %d \n", anzTurbinen);
	}
	
}
