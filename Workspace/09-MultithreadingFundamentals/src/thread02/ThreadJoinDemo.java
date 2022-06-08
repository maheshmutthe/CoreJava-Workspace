	package thread02;
public class ThreadJoinDemo {
	static Thread mainThread = null;
	public static void main(String[] args) {
		mainThread = Thread.currentThread();
		Thread thread1 = new Thread(new MyRunnable(), "First"); // Worker
        Thread thread2 = new Thread(new MyRunnable(), "Second"); // Worker
        Thread thread3 = new Thread(new MyRunnable(), "Third"); // Worker
         
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException exp) {
           System.err.println(exp.getMessage());
        }         
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException exp) {
            System.err.println(exp.getMessage());
        }
        thread3.start();
      //let all threads finish execution before finishing main thread
        try {
            thread3.join();
        } catch (InterruptedException exp) {
            System.err.println(exp.getMessage());
        }
        System.out.println("All threads are dead, exiting main thread");
	}
}

