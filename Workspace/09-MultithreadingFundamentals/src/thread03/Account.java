package thread03;
public class Account {
	// sharable data
	private double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("After deposite current balance is: " + balance);
	}

	public synchronized void withdraw(double amount) {
		
		if ((balance - amount) >= 0) {
//			Thread.sleep(100);
			balance = balance - amount;
			System.out.println("After withrwal current balance is: " + balance);
		} else 
			System.out.println("Insufficient balance");
		
		
//		try {
//			Thread.sleep(2000);
//			if ((balance - amount) >= 0) {
//				Thread.sleep(100);
//				balance = balance - amount;
//				System.out.println("After withrwal current balance is: " + balance);
//			} else {
//				System.out.println("Insufficient balance");
//			}
//		} catch (InterruptedException e) {
//
//		}
	}
}
