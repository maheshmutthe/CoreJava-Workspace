package Lab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q10 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	List<String> list5 = new ArrayList<>();

    System.out.println("Enter no. of laptops to be added in the list");
    int n = sc.nextInt();
    System.out.println("Enter names of the laptops to be added in the list");
    for(int i = 0; i<n; i++){
        String lap = sc.nextLine();
        list5.add(lap);
    }

    System.out.println("Enter laptop name you want to buy");
    String buy = sc.nextLine();

    if(list5.contains(buy)){
        System.out.println("Yes model is available");
    }else{
        System.out.println("Model not available in the list");
        System.out.println("Shopkeeper please add the laptop in the list");
        String lap = sc.nextLine();
        list5.add(lap);
    }

    Iterator<String> it6 = list5.iterator();
    while(it6.hasNext()){
        String lap = it6.next();
        System.out.println(lap);
    }

}
}