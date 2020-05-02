package org.htl.lesson_examples.interfaces.comparator;

import java.util.Comparator;
import org.htl.lesson_examples.interfaces.Bruch;

public class BruchComparator implements Comparator<Bruch> {

	@Override
	public int compare(Bruch b1, Bruch b2) {
		return (int) ((b1.ergeb() - b2.ergeb()) * 1000);
	}

}