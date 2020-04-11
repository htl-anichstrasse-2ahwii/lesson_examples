package org.htl.lesson_examples.classes_in_classes.figuren;

public class FigurenTest {

	public static void main(String[] args) {
		Kreis k = new Kreis(4);
		k.umfang();
		k.flaeche();

		Rechteck r = new Rechteck(10, 5);
		r.umfang();
		r.flaeche();

		Quadrat q = new Quadrat(4);
		q.umfang();
		q.flaeche();

		RechtwinkligesDreieck rd = new RechtwinkligesDreieck(2, 3);
		rd.umfang();
		rd.flaeche();

		Quadrat q1 = new Quadrat(6);
		q1.umfang();
		q1.flaeche();

		Quadrat q2 = new Quadrat(20);
		q2.umfang();
		q2.flaeche();

		Quadrat[] quadrat = new Quadrat[3];
		quadrat[0] = q;
		quadrat[1] = q1;
		quadrat[2] = q2;

		Rechteck[] rechtecke = new Rechteck[1];
		rechtecke[0] = r;

		RechtwinkligesDreieck[] dreiecke = new RechtwinkligesDreieck[1];
		dreiecke[0] = rd;

		Kreis[] kreis = new Kreis[1];
		kreis[0] = k;

		for (int i = 0; i < quadrat.length && quadrat[i] != null; i++) {
			quadrat[i].ausgabe();
		}

		for (int i = 0; i < rechtecke.length && rechtecke[i] != null; i++) {
			rechtecke[i].ausgabe();
		}

		for (int i = 0; i < kreis.length && kreis[i] != null; i++) {
			kreis[i].ausgabe();
		}
	}
}
