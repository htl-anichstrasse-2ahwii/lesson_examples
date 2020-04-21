package org.htl.lesson_examples.abstrakte_klassen;

public abstract class Figur implements Ausgebbar {
	abstract double  umfang();
	abstract double flaeche();
	
	public void ausgabe()
	{
		System.out.println("----------------");
		System.out.println("Umfang: " + umfang());
		System.out.println("Flaeche: " + flaeche());	
	}
	
}
