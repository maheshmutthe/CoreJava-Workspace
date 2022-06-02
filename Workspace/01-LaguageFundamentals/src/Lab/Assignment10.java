package Lab;
import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double basic,da,hra,gross;
		System.out.println("Enter Basic salary of the employee\n");
		Scanner obj1=new Scanner(System.in);
		basic=obj1.nextDouble();
		if (basic <= 15000) {
		da=70*basic/100;
		hra=20*basic/100;
		gross= basic+da+hra;
		}
		else if(basic <= 30000 && basic >15000){
			da=80*basic/100;
			hra=35*basic/100;
			gross= basic+da+hra;
		}
		else{
			da=80*basic/100;
			hra=20*basic/100;
			gross= basic+da+hra;
		}
		System.out.println("The D.A of the basic salary of the employee is:" +da);
		System.out.println("The H.R.A of the basic salary of the employee is:" +hra);
		System.out.println("The Gross salary of the employee is:" +gross);
	}

}
