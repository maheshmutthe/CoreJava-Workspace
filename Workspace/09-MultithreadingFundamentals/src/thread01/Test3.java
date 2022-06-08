package thread01;

public class Test3 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 task = new Test3();
		//obj.start;
		
		Thread t1 = new Thread(task);	//Worker Thread
		Thread t2 = new Thread(task);	//Worker Thread
		t1.start();
		t2.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--End of main--");
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name of Current Thread: "+Thread.currentThread());

		
	}

}
