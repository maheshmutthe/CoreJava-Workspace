package collection01;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
	//	HashSet<Object> hs = new HashSet<Object>();
		HashSet<String> hs = new HashSet<String>();
		hs.add("MorningStar");
		hs.add("JPM");
		hs.add("TCS");
		hs.add("Capgemini");
		hs.add("TCS");
	//	hs.add(1000);
		
		//System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			//itr.next();
			String str = itr.next();
			System.out.println("Company Name: "+str+", Length: "+str.length());
		}
		
	}

}
