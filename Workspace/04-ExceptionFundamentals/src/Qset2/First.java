package Qset2;
//class First {

//	public static void main(String args[]) {
//		try {
//			throw 404;
//		} catch (int e) {
//			System.out.println("int exception " + e);
//		}
//	}
//}

class First {
	public static void main(String args[]) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("int exception " + e);
		}
	}
}