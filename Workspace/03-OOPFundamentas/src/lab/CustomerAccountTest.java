package lab;
//import Customer.java;

public class CustomerAccountTest {

	public static void main(String[] args) {
		Customer customer = new Customer("Raju", "Rangila");
		Account Acc = new Account(15000);
		
		System.out.println(customer.getFirstName());
		

		System.out.println( Acc.getBalance());
		Acc.deposit(5000);
		System.out.println(Acc.getBalance());
		Acc.withdraw(2000);
		System.out.println(Acc.getBalance());
		
		
	}
}
