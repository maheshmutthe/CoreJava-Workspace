package Qset2;

public class Hockey2 {
	public static void main(String[] args) {
		try {
			System.out.println('A');
			throw new RuntimeException("Char not allowed!");
		} catch (Exception e) {
			System.out.println('B');
			throw e;		// eliminate
		} finally {
			System.out.println('C');
		}
	}
}