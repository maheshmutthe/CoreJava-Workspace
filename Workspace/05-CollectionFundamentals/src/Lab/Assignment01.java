package Lab;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Aman");
		arr.add("Siddheshwar");
		arr.add("Mahesh");
		arr.add("Aman");
		
		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
