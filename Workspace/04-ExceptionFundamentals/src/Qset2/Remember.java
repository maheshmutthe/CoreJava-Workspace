//package Qset2;
//
//public class Remember {
//	public static void think() throws Exception {
//		throw new Exception();
//	}
//
//	public static void main(String[] args) throws Exception {
//		try { 
//			think();
//		}catch(Exception e) {
//			System.out.println("Exception handled at client side");
//		}
//		}
//	}


package Qset2;


	public class Remember {
		public static void think() throws Exception {
			throw new Exception();
		}

		public static void main(String[] args) throws Exception {
			think();
		}
	}