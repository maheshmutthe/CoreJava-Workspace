package oop01;

public class Person {
	//instance variable
	// int- 0, double- 0.0, object- null

	private String firstName;
	private String lastName;
	private String city;
	
	public void getData(String firstName, String lastName, String city) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
}
	
	public void show() {
		System.out.println("First Name "+firstName);
		System.out.println("Last Name "+lastName);
		System.out.println("City "+city);
	}
	
	public static void main(String[] args) {
		// Local Variable 
		//default values are not applicable for local variables
		int x=0 ,y=0;
		//System.out.println(x);
		
		Person obj1 = new Person();
		obj1.firstName = "Makrand";
		obj1.lastName = "Bhoir";
		obj1.city = "Mumbai";
		
		Person obj2 = new Person();
		obj2.firstName = "Shailes";
		obj2.lastName = "Dubey";
		obj2.city = "Mumbai";
		
		obj1.show();
		obj2.show();

	}

}
