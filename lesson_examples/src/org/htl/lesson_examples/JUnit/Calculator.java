package org.htl.lesson_examples.JUnit;

/**
 * @author albert
 * Class under test for explaining JUnit
 */
public class Calculator {
	public static int add(int i1, int i2)
	{
		return i1 + i2;
	}
	
	public static int max(int i1, int i2)
	{
		if (i1 > i2) return i1;
		return i2;
	}
	
	public static int max(int i1, int i2, int i3)
	{
		return max(max(i1, i2), i3);
	}
}
