package lamda05;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Test {

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
		
//		list.stream().forEach(element -> System.out.println(element.getStudentId()));
		OptionalDouble max = list.stream().mapToDouble((Student element) -> element.getStudentScore()).max();
	//	OptionalDouble max = list.stream().mapToDouble(element -> element.getStudentScore()).max();
		System.out.println("Max Score : "+max);
	}

}
