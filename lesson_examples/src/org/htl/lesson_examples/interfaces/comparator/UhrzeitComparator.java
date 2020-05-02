package org.htl.lesson_examples.interfaces.comparator;

import java.util.Comparator;

import org.htl.lesson_examples.interfaces.Uhrzeit;

public class UhrzeitComparator implements Comparator<Uhrzeit>{
	@Override
	public int compare(Uhrzeit u1, Uhrzeit u2)  {
		return  (u1.sec() - u2.sec());
	}
}
