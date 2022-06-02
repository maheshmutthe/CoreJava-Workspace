package oop02;

import oop01.Person;

public class PersonApp {

	public static void main(String[] args){

		Person obj1 = new Person();
		obj1.getData("Makrand", "Bhoir", "Mumbai");
		
		Person obj2 = new Person();
		obj2.getData("Shailes", "Dubey", "Mumbai");
		
		obj1.show();
		obj2.show();

	}

}
