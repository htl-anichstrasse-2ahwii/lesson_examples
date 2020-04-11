package org.htl.lesson_examples.classes_in_classes;

public class Person {
	private String vorname;
	private String nachname;
	private int alter;
	private Wohnort wohnort;

	public Person(String vorname, String nachname, int alter, Wohnort wohnort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.wohnort = wohnort;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public void ausgabe() {
		System.out.printf("Vorname: %s  Nachname %s Alter: %d\n", vorname, nachname, alter);
		wohnort.ausgabe();
	}

}
