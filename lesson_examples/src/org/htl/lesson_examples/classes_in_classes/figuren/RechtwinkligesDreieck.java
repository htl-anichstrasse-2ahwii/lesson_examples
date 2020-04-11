package org.htl.lesson_examples.classes_in_classes.figuren;

public class RechtwinkligesDreieck {
	private double a;
	private double b;
	
	public RechtwinkligesDreieck(int a, int b) {
		this.a = a;
		this.b = b;
	}
	

	public double umfang()
	{
		return a+b+c(); 
	}
	
	/**
	 * @return Die Hypothenuse
	 */
	public double c()
	{
		return Math.sqrt(a*a + b*b);
	}
	
	public double flaeche()
	{
		return (a*b)/2;
	}
	
	public void ausgabe()
	{
		System.out.printf("Der Umfang beträgt %s\nDie Fläche beträgt %s\n", umfang(), flaeche());
		System.out.println();
	}
}
