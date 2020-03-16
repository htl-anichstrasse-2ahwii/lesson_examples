package org.htl.lesson_examples.inheritance;

/**
 * @author albert
 * Das Basis-Interface für die Ausgabe. So können wir alle Klassen gleich behandeln (z.B. in einer ArrayList speichern)
 * und die Methode ausgabe aufrufen, wenn sie das Ausgeben-Interface implementiert haben
 */
public interface Ausgeben {
	void ausgabe();

}
