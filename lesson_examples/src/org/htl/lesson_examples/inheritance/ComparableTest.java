package org.htl.lesson_examples.inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Fahrzeug> fzCompare = new ArrayList<Fahrzeug>();
		fzCompare.add(new Fahrzeug("rot", 100));
		fzCompare.add(new FahrzeugMitRaedern("grün", 10, 4));
		fzCompare.add(new Auto("blue", 200,4,4));
		
		//Man braucht hier keinen Rückgabewert, fzCompare wird nach dem Aufruf sortiert sein
		
		Collections.sort(fzCompare);
		System.out.println("Ausgabe für Comparable:");
		for (Fahrzeug fz : fzCompare)
		{
			System.out.println(fz);
		}
		
		//!!!Damit man die Funktionsweise von Comparator sehen kann muss man die Zeile 16 auskommentieren
		
		//Das vergleichen kann man auch extern festlegen (sinnvoll, wenn es für 
		//die gleichen Klassen unterschiedliche Sortierkriterien gibt
		Collections.sort(fzCompare, new FahrZeugComparator());
		System.out.println("Ausgabe für Comparator:");
		for (Fahrzeug fz : fzCompare)
		{
			System.out.println(fz);
		}
	}
}
