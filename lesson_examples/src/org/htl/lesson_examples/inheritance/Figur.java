package org.htl.lesson_examples.inheritance;

/**
 * @author albert
 * Die Basisklasse aller gemetrischen Figuren
 */
public abstract class Figur implements Ausgeben {
	
	//Diese beide Methoden müssen in den Unterklassen ausprogrammiert werden
	public abstract double flaeche();
	public abstract double umfang();
	
	/**
	 * Zu beachten ist hier, dass umfang() und fläche(), obwohl sie in dieser Klasse nur deklariert und
	 * gar nicht ausprogrammiert sind, verwendet werden können, es werden nämlich die Methoden der
	 * Unterklassen aufgerufen
	 */
	@Override
	public String toString() {
		String s =  getClass().getSimpleName() + 
				"\nFläche: " + flaeche() + "\n";
		s += "Umfang: " + umfang() + "\n";
		return s;
	}
	
	@Override
	public void ausgabe() {
		//durch die Übergabe von this wird hier automatisch die toString-Methode aufgerufen
		System.out.println(this);
		
	}
}
