package org.htl.lesson_examples.classes_in_classes.person;

public class PersonAusgabe {

	public static void main(String[] args) {
		Person p1 = new Person("Hubert" ,"Maier" , 16, new Wohnort("Dorfstraße", 6162,"Mutters",31));  
		Person p2 = new Person("Herbert" ,"Hofer" , 16, new Wohnort("Innrain", 6020,"Innsbruck",3));
		Person p3 = new Person("Franz" ,"Müller" , 16, new Wohnort("Salzburgerstraße", 4020,"Linz",5));
		
		p1.ausgabe();
		p2.ausgabe();
		p3.ausgabe();
	}
}
