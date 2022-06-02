package Collection04;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;
// import java.util.TreeSet;

public class ArrayListDemo {
	
	public static void printAll(List<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student(100, "Pranita", 90);
		Student obj2 = new Student(101, "Omkar", 80);
		Student obj3 = new Student(102, "Omkar", 80);
		Student obj4 = new Student(103, "Harshal", 89);
		Student obj5 = new Student(104, "Kulna", 88);
		
	

		ArrayList<Student> set = new ArrayList<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);
		
		
		//System.out.println(set);
		printAll(set);
		System.out.println("------------------------------------------------------------");
		
		Collections.sort(set, new StudentScoreSorter());
		printAll(set);
		System.out.println("------------------------------------------------------------");
		Collections.sort(set, new StudentNameSorter());
		printAll(set);
	}

}
