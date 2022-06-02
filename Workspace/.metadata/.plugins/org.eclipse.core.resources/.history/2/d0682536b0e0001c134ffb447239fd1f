package oop03;
public class Current extends Account{
	private double overdraft;
	
	public Current(int number, String holder, double balance, double overdraft) {
		super(number, holder, balance);
		this.overdraft = overdraft;
	}
	@Override
	public void showAccount() {
		super.showAccount();
		System.out.println("Overdraft: "+overdraft);
	}
}
