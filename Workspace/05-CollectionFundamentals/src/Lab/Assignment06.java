package Lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("USA", "WDC");
		map.put("England", "London");
		map.put("Japan", "Tokyo");
		
		boolean result = map.containsKey("US"); //|| 
		boolean result1 = map.containsValue("Delhi");
		if(result = true) {
			System.out.println("Present");
		}else
			System.out.println("Absent");
		if(result1 = true) {
			System.out.println("Present");
		}else
			System.out.println("Absent");
		
		// boolean result = map.containsValue("Delhi");
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Key = " +  entry.getKey()+
					", Value = "+ entry.getValue());
			
		}
		

	}

}
