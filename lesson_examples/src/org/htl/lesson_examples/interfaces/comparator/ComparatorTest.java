package org.htl.lesson_examples.interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;

import org.htl.lesson_examples.interfaces.Bruch;

public class ComparatorTest {
	public static void main(String[] args) {

		ArrayList<Bruch> bCompare = new ArrayList<Bruch>();

		bCompare.add(new Bruch(1, 2));
		bCompare.add(new Bruch(1, 4));

		Collections.sort(bCompare, new BruchComparator());

		System.out.println("Ausgabe für Comparator:");

		for (Bruch b : bCompare) {
			System.out.println(b);
		}
	}
}
