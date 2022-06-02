package lab;
public class StudentClass {

	private int studentId;
	private String studentName;
	private String contactNumber;
	private String course;
	private int fees;
	
	public StudentClass(int studentId, String studentName, String contactNumber, String course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.contactNumber = contactNumber;
		this.course = course;
		//this.fees = fees;
	}
	int getFees(int fees) {
		this.fees = fees;
		return fees;
	}

	public void studentDetails() {
		System.out.println("studentId=" + studentId + ", studentName=" + studentName + ", contactNumber="
				+ contactNumber + ", course=" + course + ", fees=" +fees);
		//
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass stu1 = new StudentClass(1, "Shubham", "9988776655", "Dac");
		stu1.getFees(9000);
		stu1.studentDetails();

	}

}
