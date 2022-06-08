package thread02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepDemo {

	public static void main(String args[]) {
		List<String> dayList = new ArrayList<>();
		dayList = Arrays.asList(new String[] { "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday", "Sunday" });

		for (String day : dayList) {
			System.out.println(day);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException exp) {
				System.err.println(exp.getMessage());
			}
		}
	}
}
