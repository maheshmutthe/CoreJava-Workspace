package lambda03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companies [] = {"Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank"};
		List<String> list = Arrays.asList(companies);
		
		list.stream().filter(s -> s.length() >= 4).map(e->e.length()).collect(Collectors.toList());
		list2.forEach(e -> System.out.println)

	}

}
