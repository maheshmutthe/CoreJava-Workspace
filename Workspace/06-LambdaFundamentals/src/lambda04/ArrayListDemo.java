package lambda04;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
		
		Comparator<Student> comparator = (Student s1, Student s2)-> {
			if(s1.getStudentScore() > s2.getStudentScore())
				return 1;
			else 
				return -1;
		};
		Collections.sort(set, comparator);
		printAll(set);
		
		System.out.println("------------------------------------------------------------");
		
		Comparator<Student> comparator2 = (s1, s2) -> (s1.getStudentName().compareTo(s2.getStudentName()));
		Collections.sort(set, comparator2);
		printAll(set);
		
		
//		Collections.sort(set, new StudentScoreSorter());
//		printAll(set);
//		System.out.println("------------------------------------------------------------");
//		Collections.sort(set, new StudentNameSorter());
//		printAll(set);
	}

}
