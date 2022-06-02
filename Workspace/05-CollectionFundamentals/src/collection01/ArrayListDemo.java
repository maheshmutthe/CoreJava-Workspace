package collection01;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();// generic type
		//LinkedList<Object> list = new LinkedList<Object>();
		int x = 10;
		
		list.add(x); // auto-boxing
		list.add(1000);
		list.add("S");
		list.add(1000.50);
		list.add(new Integer(3000));
		list.add(500);
		list.remove(3);
		list.add(1000);
		list.add(new Integer(3000));
		list.add(500);
		list.add(1000);
		
//		for(Object obj : list) {
//			if(list.get(2).equals("S")) {
//				list.remove(3);
//			}else {
//				System.out.println(obj);	
//			}			
//		}
		
//		Iterator<Object> itr = list.iterator();
//		while(itr.hasNext()) {
//			Object obj = itr.next();
//			if(obj.equals("S")) {
//				itr.remove();
//			}
////			if(list.get(2) == "S")
////				list.remove(3);
////			else
////				System.out.println(obj);
//		}
		// System.out.println(list);
		//------------------------------------------------------------
//		for (Object obj : list) {
//			System.out.println(obj);
//		}
		//--------------------------------------------------------
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
/*
 * List will allow duplicate objects to store
 * 
 */