package oop05;
class Account{
	private String accountNumber;
	private String acholderName;
	private double balance;
	public Account(String accountNumber, String acholderName, double balance) {
		this.accountNumber = accountNumber;
		this.acholderName = acholderName;
		this.balance = balance;	
	}
	public void getAccountDetails(){
		System.out.println("accountNumber is "+accountNumber);
		System.out.println("acholderName is "+acholderName);
		System.out.println("balance is "+balance);
	}
	
}

class Saving extends Account{
	private double roi;
	
	public Saving(String accountNumber, String acholderName, double balance, double roi) {
		super(accountNumber, acholderName, balance);
		this.roi = roi;
		//System.out.println("This accounts rate of interest is "+ rateOfInterest);
		// TODO Auto-generated constructor stub
	}
	//final static private double rateOfInterest = 9.2;
	 	public void getAccountDetails () {
	 		super.getAccountDetails();
	 		System.out.println("This accounts rate of interest is "+ roi);
	}
	
}
class Current extends  Account{
	private double overDraft;
	public Current(String accountNumber, String acholderName, double balance, double overDraft) {
		super(accountNumber, acholderName, balance);
		this.overDraft= overDraft;
		//System.out.println("Overdraft for this account "+overdraft);
		// TODO Auto-generated constructor stub
	}
	//final static private double overdraft = 300000;
	public void getAccountDetails() {
		super.getAccountDetails();
		System.out.println("Overdraft for this account "+overDraft);
	}
}

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account obj1 = new Current("998877665544", "Ram", 98777.9, 300000);
//		obj1.getAccountDetails();
//		
//		Account obj2 = new Saving("998877665544", "Ram", 98777.9, 9.8);
//		obj2.getAccountDetails();
//		
//		
		Account acc = null;
		if (Math.random() > 0.5) {
			acc = new Saving("998877665544", "Ram", 98777.9, 9.8);
		}
		else {
			acc = new Current("998877665544", "Ram", 98777.9, 300000);
		}
		acc.getAccountDetails();
	}

}
