package org.htl.lesson_examples.exceptions;

/**
 * In diesem Beispiel sieht man dass kein Exception-Handling zwingend erforderlich ist (RuntimeException),
 * aber was passiert wenn eine auftritt
 *
 */
public class ExampleSimpleRuntimeExceptionMethod {

	static int getNumber11()
	{
		int[] x = new int[10];
		return x[11]; 
	}
	
	
	public static void main(String[] args) {
		try
		{
			getNumber11();	
		} catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Das Programm laeuft aber weiter!!");

	}

}
