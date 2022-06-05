package lab;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;
// import java.util.Treelist;

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
		
	

		ArrayList<Student> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		
		
		//System.out.println(list);
		printAll(list);
		System.out.println("------------------------------------------------------------");
		
		Comparator<Student> compare = 
		
		
		
		
		
//		Collections.sort(list, new StudentScoreSorter());
//		printAll(list);
//		System.out.println("------------------------------------------------------------");
//		Collections.sort(list, new StudentNameSorter());
//		printAll(list);
	}

}
