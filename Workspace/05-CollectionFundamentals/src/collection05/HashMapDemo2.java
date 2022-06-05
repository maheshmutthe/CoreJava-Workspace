package collection05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Makarand", 35);
		map.put("Maitri", 4);
		map.put("Raju", 40);
		map.put("Mahi", 2);
		map.put("Rahul", 34);
		map.put("Vishakha", 30);
		map.put("Mithun", 28);
		map.put("Turesh", 31);
		map.put("Girish", 30);
		map.put("Maitri", 3);
		map.put(null, 0);
		map.put("Nsha", 37);
		map.put("Amit", 38);
		map.put("Ram", 40);
		map.put("Siya", 12);
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
		System.out.println("--------------------------------------------");
		
		//for(int value : arr)
		
		for(Entry<String, Integer> entry2 : map.entrySet()) {
			System.out.println(entry2.getKey()+", "+entry2.getValue());
		}
	}
}