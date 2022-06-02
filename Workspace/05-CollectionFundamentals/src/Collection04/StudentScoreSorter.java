package Collection04;

import java.util.Comparator;

public class StudentScoreSorter implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getStudentScore() > o2.getStudentScore()) 
			return 1;
			else
				return -1;
	}


	
	
}
