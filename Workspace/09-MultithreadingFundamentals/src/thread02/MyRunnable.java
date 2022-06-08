package thread02;
import java.util.Random;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Work Start: " + Thread.currentThread().getName());
		int number = new Random().nextInt(10);
		for (int i = 1; i <= 10; i++)
			System.out.print(number * i + " ");

		System.out.println("\nWork Finish: " + Thread.currentThread().getName());
		System.out.println("Main Thread State: "+ThreadJoinDemo.mainThread.getState());
		System.out.println("-----------------------------------------------");
	}
}
