package lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		String companies [] = {"Infosys", "TCS", "LTI"};
		List<String> list = Arrays.asList(companies);
		
		int sum=0;
		int count=0;
		
	//	List <Integer> list2=list.stream().filter(s ->s.length() >=4).map(e ->e.length()).collect(Collectors.toList());
		List <Integer> list2=list.stream().filter(s ->s.length() >0).map(e ->e.length()).collect(Collectors.toList());
		
		 Integer min = list2.stream().min(Integer::compare).get();
		 Integer max = list2.stream().max(Integer::compare).get();
		 Integer avg = list2.stream().average().get();
		 
		 for (Integer integer : list2) {
			
			 sum+=integer;
			 count++;
		}
	       
         System.out.println("Sum :"+sum);
		 System.out.println("Minimum :" +min);
		 System.out.println("Maximum :" +max);
		 System.out.println("count :"+count);

		
	}

}