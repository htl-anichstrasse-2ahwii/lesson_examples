package org.htl.lesson_examples.inheritance;

import java.util.ArrayList;

public class FigurTest {
public static void main(String[] args) {
	
	/* Hier können wieder alle konkreten Unterklassen gleich als Figuren behandelt werden */
	ArrayList<Figur> figuren = new ArrayList<Figur>();
	figuren.add(new Kreis(100));
	figuren.add(new Rechteck(10, 20));
	for (Figur f : figuren) {
		System.out.println("################");
		System.out.println(f);
	}
	
	
}
}
