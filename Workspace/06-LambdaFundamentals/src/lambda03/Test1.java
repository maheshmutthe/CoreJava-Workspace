package lambda03;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		String companies[] = { "Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank" };
		List<String> list = Arrays.asList(companies);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println("str: " + str + ", length: " + str.length());
		}

		System.out.println("---------------------------------------------------");

		Stream<String> stream1 = list.stream();

		Consumer<String> consumer = (String str) -> System.out.println(str);
		stream1.forEach(consumer);
		System.out.println("------------------------------------------------------");

		Stream<String> stream2 = list.stream();
		stream2.forEach((String str) -> System.out.println(str));
	}
}
