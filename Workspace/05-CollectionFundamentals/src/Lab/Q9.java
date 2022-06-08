package Lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



class Properties {
    String states;
    String capital;

    public Properties(String states, String capital) {
        this.states = states;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "states='" + states + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
public class Q9 {

	public static void main(String[] args) {
		List<Properties> list4 = new ArrayList<>();

        list4.add(new Properties("Maharashtra", "Mumbai"));
        list4.add(new Properties("UttarPradesh", "Lucknow"));
        list4.add(new Properties("Karnataka", "Bangalore"));
        list4.add(new Properties("Gujarat", "Surat"));
        list4.add(new Properties("WestBengal", "Kolkata"));

        Iterator<Properties> it5 = list4.iterator();
        while(it5.hasNext()){
            Properties prop = it5.next();
            System.out.println(prop.states+" "+prop.capital);
        }

	}

}