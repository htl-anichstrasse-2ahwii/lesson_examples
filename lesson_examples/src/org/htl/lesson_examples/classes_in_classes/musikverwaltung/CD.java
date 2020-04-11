package org.htl.lesson_examples.classes_in_classes.musikverwaltung;

public class CD {
	private String name;
	private Interpret interpret;
	private Song[] songs = new Song[30];
	private int pos = 0;
	
	public void addSong(Song song)
	{
		songs[pos++] = song;
	}
	public void removeSong(int position)
	{
		for (int i = position; i < pos; i++) {
			songs[i] = songs[i +1];
		}
	}
	public void ausgabe()
	{
		System.out.printf("Der Name der CD lautet '%s'!\n", name);
		interpret.ausgabe();
		System.out.println();
		for (int i = 0; i < songs.length && songs[i] != null; i++) {
			songs[i].ausgabe();
		}
		System.out.println();
	}
	
	
	public CD(String name, Interpret interpret) {
		this.name = name;
		this.interpret = interpret;
	}

	public Interpret getInterpret() {
		return interpret;
	}
}
