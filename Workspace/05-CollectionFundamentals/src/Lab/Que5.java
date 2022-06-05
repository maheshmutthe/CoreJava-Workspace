package Lab;

import java.util.HashSet;
import java.util.Iterator;

class Employees
{
	private int id;
	private String name;
	private String address;
	private double sal;
	
	public Employees(int id, String name, String address, double sal) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
}

public class Que5 {

	public static void main(String[] args) {
	
		HashSet<Employees> hs = new HashSet<Employees>();
		Employees emp = new Employees(2, "Rosy", "America", 75000.0);
		
		hs.add(new Employees(1, "John", "America", 95000));
		hs.add(emp);
		
		Iterator<Employees> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}