package collection05;

import java.util.HashMap;

public class HashMapDemo {
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
		
//		int ageMahi = map.get("Mahi");
//		System.out.println(ageMahi);
		
		System.out.println(map);
		//System.out.println(map.toString());
	}
}