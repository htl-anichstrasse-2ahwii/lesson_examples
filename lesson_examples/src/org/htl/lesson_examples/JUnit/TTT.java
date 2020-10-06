package org.htl.lesson_examples.JUnit;

import java.util.Scanner;

/*
 * 6 7 8
 * 3 4 5
 * 0 1 2
 */
public class TTT {

	private char[] sf = new char[9]; // {'0', '1'};
	private char werAmZug = 'X';

	public void init() {
		for (int i = 0; i < sf.length; i++) {
			sf[i] = ' ';
		}
	}

	public void ausgabe() {
		System.out.printf("%s|%s|%s\n", sf[6], sf[7], sf[8]);
		System.out.printf("%s|%s|%s\n", sf[3], sf[4], sf[5]);
		System.out.printf("%s|%s|%s\n", sf[0], sf[1], sf[2]);
	}

	public boolean gewonnen() {
		String erg = "" + sf[0] + sf[1] + sf[2] + "|" + sf[3] + sf[4] + sf[5] + "|" + sf[6] + sf[7] + sf[8] + "|"
				+ sf[6] + sf[3] + sf[0] + "|" + sf[7] + sf[4] + sf[1] + "|" + sf[8] + sf[5] + sf[2] + "|" + sf[6]
				+ sf[4] + sf[2] + "|" + sf[8] + sf[4] + sf[0];
		return erg.contains("OOO") || erg.contains("XXX");

	}

	public boolean spielZug(int pos) {
		// ist das Spielfeld besetzt? => return false;
		if (sf[pos] != ' ')
			return false;

		// setze aktuellen Spieler auf pos
		sf[pos] = werAmZug;
		// Spielerwechsel
		if (werAmZug == 'X')
			werAmZug = 'O';
		else
			werAmZug = 'X';

		return true;
	}

	public boolean voll() {
		for (int i = 0; i < sf.length; i++) {
			if (sf[i] == ' ')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TTT ttt = new TTT();
		ttt.init();
		while (!ttt.voll() && !ttt.gewonnen()) {
			ttt.ausgabe();
			System.out.println("Bitte Position eingeben:");
			int pos = scanner.nextInt();
			if (!ttt.spielZug(pos)) {
				System.out.println("Position ungültig");
			}
		}
		ttt.ausgabe();
		if (ttt.gewonnen()) {
			char gewonnen = 'X';
			if (ttt.werAmZug == 'X')
				gewonnen = 'O';
			System.out.printf("Gratuliere Spieler %s:", gewonnen);
		} else {
			System.out.println("Unentschieden!");
		}
		scanner.close();
	}

}
