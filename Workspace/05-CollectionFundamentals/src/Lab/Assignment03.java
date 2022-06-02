package Lab;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Assignment03 {
	public static void main(String[] args) {
		TreeSet<String> str = new TreeSet<>();
		
		str.add("Aman");
		str.add("Siddheshwar");
		str.add("Mahesh");
		str.add("Aman");
		
		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(str.contains("Mahesh"));
		
		NavigableSet<String> revStr = str.descendingSet();
		
		// System.out.println(revStr);
		
		Iterator<String> rev = revStr.iterator();
		while (rev.hasNext()) {
			System.out.println(rev.next());
		}
		
		

	}
}
