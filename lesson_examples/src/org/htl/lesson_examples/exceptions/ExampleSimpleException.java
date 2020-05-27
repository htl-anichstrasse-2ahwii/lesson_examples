package org.htl.lesson_examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleSimpleException {

	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new File("test.txt"));
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Programm laeuft weiter");
	}
}
