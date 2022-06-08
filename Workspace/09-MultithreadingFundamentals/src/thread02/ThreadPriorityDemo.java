package thread02;
public class ThreadPriorityDemo extends Thread {
	@Override
	public void run() {
		System.out.printf("Running thread name is: %s \n", Thread.currentThread().getName());
		System.out.printf("Running thread priority is: %d \n", Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ThreadPriorityDemo thread1 = new ThreadPriorityDemo(); // Worker, Task
		ThreadPriorityDemo thread2 = new ThreadPriorityDemo(); // Worker, Task
		thread1.setName("Child-1");
		thread2.setName("Child-2");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		System.out.println("Thread Current Priority =" + Thread.currentThread().getPriority());
		System.out.println("-------------------------------------------------");
	}
}
