package thread03;

public class SingleThreadedBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Bhairavi", "Bhole");
		Account account = new Account(1000);
		customer.setAccount(account);	//setup Relation
		
		
		System.out.println("Initial Balance : "+ customer.getAccount().getBalance());
		account.deposite(5000);
		System.out.println("After Deposit Balance : "+ account.getBalance());
		account.withdraw(1500);
		System.out.println("After Withdrawl Balance : "+ account.getBalance());
		account.withdraw(4500);
		account.withdraw(500);




		

	}

}
