package oop03;
class Saving extends Account{
	private double roi;
	
	public Saving(int number, String holder, double balance, double roi) {
		//super(number, holder, balance);
		this.roi = roi;
	}
	@Override
	public void showAccount() {
		super.showAccount();
		System.out.println("ROI: "+roi);
	}
}
