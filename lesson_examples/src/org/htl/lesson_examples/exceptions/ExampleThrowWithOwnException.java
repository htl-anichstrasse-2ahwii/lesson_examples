package org.htl.lesson_examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleThrowWithOwnException {
	static void readFile() throws IncorrectFileNameException
	{
		Scanner s;
		try {
			s = new Scanner(new File("notexisting_file.txt"));
		} catch (FileNotFoundException e) {
			throw new IncorrectFileNameException("Diese Datei gibt es nicht");
		}
		s.close();
	}
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (IncorrectFileNameException e) {
			e.printStackTrace();
		}
		System.out.println("Aber das Programm laeuft weiter");
	}
	
}
