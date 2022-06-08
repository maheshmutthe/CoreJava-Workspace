package thread03;

class WithdrawalTask implements Runnable{
	private Customer customer;
	WithdrawalTask(Customer customer){
		this.customer = customer;
	} 
	
	@Override
	public void run() {
		customer.getAccount().withdraw(2500);
	}
}

public class MultiThreadedBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Bhairavi", "Bhole");
		Account account = new Account(1000);
		customer.setAccount(account);	//setup Relation
				
		System.out.println("Initial Balance : "+ customer.getAccount().getBalance());
		account.deposite(5000);
		// MultiThraed withrawal Mode
		
		WithdrawalTask task = new WithdrawalTask(customer);
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		Thread t4 = new Thread(task);
		Thread t5 = new Thread(task);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	

	}

}
