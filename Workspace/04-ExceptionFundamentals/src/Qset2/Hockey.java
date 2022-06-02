package Qset2;

public class Hockey {
	public static void main(String[] args) {
		try {
			int score = 1;	//Scope isn't global
			System.out.println(score++);
		} catch (Exception e) {
			System.out.println(score++);
		} finally {
			System.out.println(score++);
		}
		System.out.println(score++);
	}
}