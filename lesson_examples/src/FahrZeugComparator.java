import java.util.Comparator;

import org.htl.lesson_examples.inheritance.Fahrzeug;

public class FahrZeugComparator implements Comparator<Fahrzeug> {

	@Override
	public int compare(Fahrzeug f1, Fahrzeug f2) {
		//Verglichen wird auf 2 Kommastellen genau, deshalb * 100
		return (int)((f1.getGeschwindigkeit() - f2.getGeschwindigkeit())*100);
	}

}
