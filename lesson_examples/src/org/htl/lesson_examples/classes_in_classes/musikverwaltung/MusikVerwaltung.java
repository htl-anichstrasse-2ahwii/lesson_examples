package org.htl.lesson_examples.classes_in_classes.musikverwaltung;

public class MusikVerwaltung {
	private CD[] cds = new CD[1000];
	private int pos = 0;

	public void addCD(CD cd) {
		cds[pos++] = cd;
	}

	public void removeCD(int position) {
		for (int i = position; i < pos; i++) {
			cds[i] = cds[i + 1];
		}
	}

	public void ausgabe() {
		for (int i = 0; i < cds.length && cds[i] != null; i++) {
			cds[i].ausgabe();
		}
	}
}
