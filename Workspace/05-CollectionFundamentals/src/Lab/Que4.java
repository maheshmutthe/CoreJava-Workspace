package Lab;


import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	private int id;
	private String name;
	private String address;
	private double sal;
	
	public Employee(int id, String name, String address, double sal) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}

	public int getId() {
		return id;
	}
}


public class Que4 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(1, "John", "America", 95000.0));
		al.add(new Employee(2, "Rosy", "America", 75000.0));

		Iterator<Employee> itr = al.iterator();	
		while(itr.hasNext())
		{
			String s = itr.next().toString();
			System.out.println(s);
		}
		System.out.println("------------------SEARCH------------------------");
		
		Iterator<Employee> itr1 = al.iterator();
		int searchId = 2;
		while(itr1.hasNext())
		{
			Employee emp = itr1.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		
		}
	}
}
