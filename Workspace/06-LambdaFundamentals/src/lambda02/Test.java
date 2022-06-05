package lambda02;

public class Test {
	public static void main(String[] args) {
		Max ref1 = (int x1, int x2) -> {
			if(x1 > x2)
				return x1;
			else
				return x2;
		};
		
		System.out.println("Max : "+ ref1.max(100, 200));
		
		Max ref2 = (x1, x2) ->{
			if(x1 > x2)
				return x1;
			else
				return x2;
		};
		
		System.out.println("Max :"+ ref2.max(100, 200));
		
		Max ref3 = (x1, x2) -> {
			int result = (x1 > x2) ? x1:x2;
			return result;
		};
		System.out.println("Max: "+ ref3.max(100, 200));
		
		Max ref4 = (x1, x2) -> (x1 > x2) ? x1 : x2;
		System.out.println("Max: "+ ref4.max(100, 200));

	}

}
