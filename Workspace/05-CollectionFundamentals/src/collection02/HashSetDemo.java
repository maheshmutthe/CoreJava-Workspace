package collection02;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student(100, "Pranita", 90);
		Student obj2 = new Student(101, "Omkar", 80);
		Student obj3 = new Student(101, "Omkar", 80);
		
		System.out.println("Student1 hashcode :"+ obj1.hashCode());
		System.out.println("Student2 hashcode :"+ obj2.hashCode());
		System.out.println("Student3 hashcode :"+ obj3.hashCode());


		HashSet<Student> set = new HashSet<>();
		boolean status3 =set.add(obj1);
		System.out.println("1st Status : "+status3);
		boolean status2 =set.add(obj2);
		System.out.println("2nd Status : "+status2);
		boolean status = set.add(obj3);
		System.out.println("3rd Status : "+status);
		
		
		
		System.out.println(set);

	}

}
