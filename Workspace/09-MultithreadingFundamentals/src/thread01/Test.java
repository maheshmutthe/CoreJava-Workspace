package thread01;

public class Test {
	public void run() {
		System.out.println("Name of Current Thread: "+Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().run();

	}

}
