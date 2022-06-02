package collection01;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10001);
		int element = 1234;
		set.add(element);
		set.add(1001);
		set.add(7);
		set.add(1234);
		
		System.out.println(set);
		
//		Iterator<Integer> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}
}
