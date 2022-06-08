package lab2q4;

public class Factorial {
	public static void main(String[] args) {
		I1 ref = (num) -> {
			double num1 = 1;
			for (int i = 1; i <= num; i++) {
				num1 = num1 * i;     
			}
			return num1;
		};
		System.out.println("Factorial is: "+ref.fuctorial(5)); 
	}

}
