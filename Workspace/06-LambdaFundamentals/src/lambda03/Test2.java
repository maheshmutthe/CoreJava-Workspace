package lambda03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companies [] = {"Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank"};
		List<String> list = Arrays.asList(companies);
		
		System.out.println("Display List: ");
		// list.stream().forEach((String str) -> System.out.println(str));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Predicate<String> predicate = (String str) -> {
			boolean result = str.length() >= 4 ;
			return result;
		};
		list.stream().filter(predicate).forEach(str -> 	System.out.println(str));

	}

}
