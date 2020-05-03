package org.htl.lesson_examples.matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixAufgaben_01_10 {

	/**
	 * Aufgabe 01
	 */
	static void laengenermittlung() {
		int[][] m = new int[10][20];
		int l1 = m.length; // Anzahl der Zeilen (bzw. des aeusseren Arrays
		int l2 = m[0].length; // Anzahl der Spalten (bzw. des ersten inneren Arrays)
		System.out.printf("Zeilen: %d, Spalten: %d\n", l1, l2);
	}

	/**
	 * Aufgabe 02 Hier sieht man, dass eine unterschiedliche Laenge bei den
	 * Unter-Arrays moeglich ist
	 */
	static void gleichelaenge() {
		int[][] m = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].length);
		}
	}

	/**
	 * Aufgabe 03
	 * 
	 * @param mat Die Matrix, die ausgegeben werden soll
	 */
	static void ausgabe(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) // bei der Verwendung von i sind auch unterschiedliche
													// Spaltenlaengen moeglich
			{
				System.out.printf("%5d ", mat[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Aufgabe 04: Erzeuge eine quatratische Matrix mit Zufallszahlen
	 * 
	 * @param groesse    die Dimensionen der Matrix
	 * @param obergrenze Die Maximale Groesse der Zufallszahlen
	 * @return die mit Zufallszahlen befuellte Matrix
	 */
	static int[][] zzMatrize(int groesse, int obergrenze) {
		int mat[][] = new int[groesse][groesse];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * obergrenze) + 1;
			}
		}
		return mat;
	}

	/**
	 * Aufgabe 05: Anzahl der 0en in einer Matrix
	 * 
	 * @param mat Die Matrix, in der die 0en gezaehlt werden sollen
	 * @return Die Anzahl der 0en
	 */
	static int anzahl0en(int mat[][]) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == 0) {
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * Aufgabe 06: Die Summe der Zahlen in der Matrix soll berechnet werden
	 * 
	 * @param mat Die Matrix, auf der basierend die Summe berechnet werden soll
	 * @return die berechnete Summe
	 */
	static int summe(int mat[][]) {
		int summe = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				summe += mat[i][j];
			}
		}
		return summe;
	}

	/**
	 * Aufgabe 07: Hole eine bestimmte Zeile aus einer Matrix
	 * 
	 * @param mat      Die Matrix, von der die Zeile geholt werden soll
	 * @param zeilenNr die Nummer der Zeile, die geholt werden soll
	 * @return die geholte Zeile. Wenn die Zeile nicht existiert, soll eine leere
	 *         Zeile zurueckgegeben werden
	 */
	static int[] zeile(int mat[][], int zeilenNr) {
		if (mat.length - 1 > zeilenNr) {
			return new int[0];
		}
		return mat[zeilenNr]; // Dadurch dass alle Zeilen in einem Array zusammengefasst sind, reicht die
								// Anweisung aus
	}

	/**
	 * Aufgabe 08: Zeilenweise Ueberpruefung eines
	 * 
	 * @param feld Das Spielfeld, bestehend aus 'X', 'O', und leeren Elementen
	 * @return gibt es vier 'X' oder 4 'O' in der Matrix?
	 */
	static boolean gewonnen(char[][] feld) {
		String z = " ";
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld.length; j++) {
				z += feld[i][j];
			}
			z += "|";
		}
		return z.contains("xxxx") || z.contains("oooo");
	}

	/**
	 * Aufgabe 09: Vergleiche 2 Matrixen, ob sie die gleichen Elemente beinhalten
	 * 
	 * @param mat  Matrix 1 fuer den Vergleich
	 * @param mat2 Matrix 2 fuer den Vergleich
	 * @return true, wenn die Laenge und der Inhalt uebereinstimmt
	 */
	static boolean vergleich(int[][] mat, int[][] mat2) {
		// Wenn die Anzahl Zeilen nicht gleich sind, sind die Matrizen sicher nicht
		// gleich
		if (mat.length != mat2.length) {
			return false;
		}

		for (int i = 0; i < mat.length; i++) {
			// Wenn die Spaltenlaengen unterschiedlich sind, sind die Matrizen sicher nicht
			// gleich
			if (mat[i].length != mat2[i].length) {
				return false;
			}

			for (int j = 0; j < mat2.length; j++) {
				// Wenn sich eine Zelle unterscheidet, sind die beiden Matrizen sicher nicht
				// gleich
				if (mat[i][j] != mat[i][j]) {
					return false;
				}
			}
		}
		// Wenn keine der obigen Kriterien zugetroffen sind, dann sind die beiden
		// Matrizen gleich
		return true;
	}

	/**
	 * Aufgabe 10: Einlesen von Zahlen aus einer Textdatei in eine Matrix
	 * 
	 * Es muss ein Textdatei mit dem Namen z.txt direkt im Projektverzeichnis
	 * existieren, die z.B. folgenden Aufbau hat: 3 5 1 2 3 4 5 10 20 30 40 50 11 21
	 * 31 41 45
	 * 
	 * @return Eine neue Matrix, die mit den Zahlen aus der Textdatei befuellt ist
	 */
	static int[][] einlesen() throws FileNotFoundException {
		Scanner s = new Scanner(new File("z.txt"));

		String l = s.nextLine(); // 3 5
		String[] ls = l.split(" "); // {"3","5"}
		int zeilen = Integer.parseInt(ls[0]); // 3
		int spalten = Integer.parseInt(ls[1]); // 5

		int[][] m = new int[zeilen][spalten];
		int zeile = 0;
		while (s.hasNextLine()) {
			l = s.nextLine();
			ls = l.split(" "); // {"1", "3", "2", "45", "5" }
			for (int i = 0; i < ls.length; i++) {
				m[zeile][i] = Integer.parseInt(ls[i]);
			}
			zeile++;
		}

		s.close();
		return m;
	}

	public static void main(String[] args) {
		// Testausgabe Aufgabe 04:
		int[][] m = zzMatrize(10, 100); // m ist die Basis fuer die weiteren Beispiele

		// Testausgabe Aufgabe 03:
		ausgabe(m);

		System.out.println();
		int s = summe(m);
		System.out.printf("Die Summe betraegt %d\n", s);

		System.out.println();
		char[][] viergew = { { 'X', 'X', 'X', 'O', 'O' }, { 'X', 'O', 'O', 'O', 'O' }, { 'X', 'O', 'X', 'X', 'O' } };
		boolean g = gewonnen(viergew);
		System.out.printf("Sie haben gewonnen: %b", g);
	}
}
