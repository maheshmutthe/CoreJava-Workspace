package lab2;

public class NumberSq {

	public static void main(String[] args) {
		I1 ref = (x, y) -> Math.pow(x, y);
		System.out.println("Result : " + ref.square(10, 5));
	}
}