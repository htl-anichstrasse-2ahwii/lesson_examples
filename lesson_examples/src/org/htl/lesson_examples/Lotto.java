package org.htl.lesson_examples;

import java.util.Scanner;

public class Lotto {

	static Scanner s = null;

	/**
	 * 
	 * @param arr Das array in dem gesucht wird
	 * @param zahl der Wert der gesucht wird
	 * @return true wenn der Wert gefunden
	 */
	static boolean kommtVor(int[] arr, int zahl) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == zahl) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Ziehung der Lottozahlen
	 * 
	 * @param anzahl     Wie viele Zahlen sollen gezogen werden. Die letzte Zahl ist
	 *                   die Zusatzzahl (6 Zahlen + 1 Zusatzzahl)
	 * @param ausWieViel die Obergrenze, z.B. Oesterreichisches Lotto: 45
	 * @return das mit den Zahlen befüllte Array
	 */
	static int[] lottoZahlen(int anzahl, int ausWieViel) {
		int[] zahlen = new int[anzahl];
		int i = 0;
		while (i < anzahl) {
			int neu = (int) (Math.random() * ausWieViel) + 1;
			if (!kommtVor(zahlen, neu)) {
				zahlen[i] = neu;
				i++;
			}
		}
		return zahlen;
	}

	static int[] eingabe(int anzahl, int ausWieViel) {
		int[] zahlen = new int[anzahl];
		for (int i = 0; i < anzahl - 1; i++) {
			System.out.printf("Eingabe Zahl %d:\n", i + 1);
			zahlen[i] = s.nextInt();
		}
		System.out.println("Zusatzzahl:");
		zahlen[zahlen.length - 1] = s.nextInt();

		return zahlen;
	}

	/**
	 * Gib die Lottozahlen aus. Die Zusatzzahl (die letzte Zahl) wird extra
	 * ausgegeben
	 */
	static void ausgabe(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("zz: %d\n", arr[arr.length - 1]);
	}

	/**
	 * Wie viele Zahlen sind gleich (ausgenommen der letzte Wert, die Zusatzzahl
	 * 
	 * @return
	 */
	static int anzahlGleiche(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return -1;
		int anzahl = 0;
		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = 0; j < arr1.length-1;j++)
			{
				if (arr1[i] == arr2[j])
					anzahl++;
			}
		}
		return anzahl;
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int anzahl = 7;
		int[] eingabe = eingabe(anzahl, 45);
		int[] gezogen = lottoZahlen(7, 45);
		System.out.println("Ziehung:");
		ausgabe(gezogen);
		System.out.println("Eingabe:");
		ausgabe(eingabe);
		int gleich = anzahlGleiche(eingabe, gezogen);
		boolean zzGleich = (eingabe[anzahl - 1] == gezogen[anzahl - 1]);
		System.out.printf("Anzahl gleiche %d. Zusatzzahl: %s\n", gleich, zzGleich);
		s.close();
	}
}
