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
		for (Fahrzeug fz : fzCompare)
		{
			System.out.println(fz);
		}
	}

}
