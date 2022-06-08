package thread01;

public class Test2 extends Thread{
	@Override
	public void run() {
		System.out.println("Name of Current Thread: "+Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		//obj.run();
		obj.start();

	}

}
