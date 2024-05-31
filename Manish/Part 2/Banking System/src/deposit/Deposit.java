package deposit;

import bankImplementation.Bank;

public class Deposit {
	public static void deposit(double amount) {
		Bank.bal += amount;
		Bank.prevTrans=amount;
		System.out.println(amount+" deposit successfully");
	}
}
