package lab;
public class Account {

	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		this.balance = balance + amt;
	}
	
	public void withdraw(double amt) {
		this.balance = balance - amt;
	}


}
