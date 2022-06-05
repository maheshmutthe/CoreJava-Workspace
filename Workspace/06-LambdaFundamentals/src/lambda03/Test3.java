package lambda03;

import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companies [] = {"Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank"};
		List<String> list = Arrays.asList(companies);
		
		list.stream().filter((String s)-> s.length() > 4);	
		

	}

}
