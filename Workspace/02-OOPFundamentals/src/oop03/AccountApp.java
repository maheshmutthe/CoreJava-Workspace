package oop03;

//import oop03.Account;
//import oop03.Current;
//import oop03.Saving;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = null;
		if (Math.random() > 0.5) {
			acc = new Saving(998877665, "Ram", 98777.9, 9.8);
		}
		else {
			acc = new Current(998877665, "Ram", 98777.9, 300000);
		}
		acc.showAccount();

	}

}
