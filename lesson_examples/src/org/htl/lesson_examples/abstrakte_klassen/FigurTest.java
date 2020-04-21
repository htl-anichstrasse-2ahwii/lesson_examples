package org.htl.lesson_examples.abstrakte_klassen;

import java.util.ArrayList;
import java.util.Collections;

public class FigurTest {

	public static void main(String[] args) {
		ArrayList<Figur> figuren = new ArrayList<Figur>();
		figuren.add(new Kreis(10));
		figuren.add(new Rechteck(10,30));
		figuren.add(new Quadrat(10,20));
		
		for (Figur figur : figuren) {
			figur.ausgabe();
		}
		
		System.out.println("----------------");
		
		ArrayList<Ausgebbar> au = new ArrayList<Ausgebbar>();
		au.add(new Hund());
		au.add(new Kreis(10));
		
		for (Ausgebbar ausgebbar : au) {
			ausgebbar.ausgabe();
		}
		
		Kreis k1 = new Kreis(3);
		Kreis k2 = new Kreis(30);
		System.out.println(k1.compareTo(k2));
		
		System.out.println("-----KREISE------------------");
		ArrayList<Kreis> kreise = new ArrayList<Kreis>();
		kreise.add(new Kreis(13));
		kreise.add(new Kreis(3));
		kreise.add(new Kreis(30));
		kreise.add(new Kreis(1));
		
		Collections.sort(kreise);
		
		for (Kreis kreis : kreise) {
			System.out.println(kreis.getRadius());
		}
		
	}
}
