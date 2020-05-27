package org.htl.lesson_examples.exceptions;

public class ExampleSimpleTryCatch {

	public static void main(String[] args) {
		try {
			int[] x = new int[10];
			x[11] = 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Das Programm ist aber nicht abgestuerzt");
	}

}
