package org.htl.lesson_examples.classes_in_classes;

public class Wohnort {
	private String strasse;
	private int postleitzahl;
	private String ort;
	private int hausnummer;

	public Wohnort(String strasse, int postleitzahl, String ort, int hausnummer) {
		this.strasse = strasse;
		this.postleitzahl = postleitzahl;
		this.ort = ort;
		this.hausnummer = hausnummer;
	}
	
	public String getStraße() {
		return strasse;
	}

	public void setStraße(String straße) {
		this.strasse = straße;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public void ausgabe() {
		System.out.printf("Straße: %s PLZ %d,Ort: %s, Hausnummer: %d\n", strasse, postleitzahl, ort, hausnummer);
	}
}
