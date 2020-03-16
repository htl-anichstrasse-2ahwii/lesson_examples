package org.htl.lesson_examples.inheritance;

import java.util.ArrayList;

public class AusgabeTest {

	public static void main(String[] args) {
		//Alle Klassen, die hier verwendet werden, haben das Interface Ausgeben implementiert
		ArrayList<Ausgeben> ag = new ArrayList<Ausgeben>();
		ag.add(new Fahrzeug("farbe", 123));
		ag.add(new Kreis(12));
		ag.add(new Rechteck(12, 2));
		
		//So kann man die Methode Ausgabe auch für alle aufrufen
		//Das einzige, dass man jetzt von dieser Klasse wissen muss ist, dass eine Methode ausgabe implementiert ist
		for (Ausgeben a : ag)
		{
			a.ausgabe();
		}
	}

}
