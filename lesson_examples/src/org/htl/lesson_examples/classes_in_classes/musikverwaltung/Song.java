package org.htl.lesson_examples.classes_in_classes.musikverwaltung;

public class Song {
	private String name;
	private double laenge;

	public Song(String name, double laenge) {
		this.name = name;
		this.laenge = laenge;
	}

	public String getName() {
		return name;
	}

	public double getLaenge() {
		return laenge;
	}

	public void ausgabe() {
		System.out.printf("Song '%s' hat eine Länge von %.2f!\n", name, laenge);
	}
}
