package org.htl.lesson_examples.inheritance;

import java.util.ArrayList;

public class ToStringTest {

	public static void main(String[] args) {
		ArrayList<Fahrzeug> fzCompare = new ArrayList<Fahrzeug>();
		fzCompare.add(new Fahrzeug("rot", 100));
		fzCompare.add(new FahrzeugMitRaedern("grün", 10, 4));
		fzCompare.add(new Auto("blue", 200,4,4));
		
		for (Fahrzeug fz : fzCompare)
		{
			//dadurch dass in allen Klassen toString überlagert ist, wird es automatisch bei der Ausgabe aufgerufen
			System.out.println(fz);
		}

	}

}
