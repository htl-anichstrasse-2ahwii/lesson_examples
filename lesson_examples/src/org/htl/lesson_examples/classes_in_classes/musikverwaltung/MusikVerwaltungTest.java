package org.htl.lesson_examples.classes_in_classes.musikverwaltung;

public class MusikVerwaltungTest {

	public static void main(String[] args) {
		MusikVerwaltung m1 = new MusikVerwaltung();
		
		Song s1 = new Song("All I want for Christmas is you", 3.10);
		Song s2 = new Song("Jingel Bells Rock", 3.20);
		Song s3 = new Song("Play", 3.20);
		
		Interpret i2 = new Interpret("Alan Walker", 2014);
		Interpret i1 = new Interpret("Michael Zechner", 2017);
		
		CD c1 = new CD("Christmas Hits", i1);
		CD c2 = new CD("Alan Walker", i2);
		m1.addCD(c2);
		m1.addCD(c1);
		c2.addSong(s1);
		c1.addSong(s2);
		c1.addSong(s3);
		m1.removeCD(0);
		m1.ausgabe();
	}

}
