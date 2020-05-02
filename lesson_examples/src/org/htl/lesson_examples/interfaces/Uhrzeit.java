package org.htl.lesson_examples.interfaces;

public class Uhrzeit implements Comparable<Uhrzeit> {

	private int stunde;
	private int minute;
	private int sekunde;

	public Uhrzeit(int stunde, int minute, int sekunde) {
		this.stunde = stunde;
		this.minute = minute;
		this.sekunde = sekunde;
	}

	@Override
	public int compareTo(Uhrzeit o) {
		return sec() - o.sec();
	}

	public int sec() {
		return (stunde * 3600) + (minute * 60) + sekunde;
	}

}
