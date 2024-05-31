package withdrawal;

import bankImplementation.Bank;

public class Withdrawal {
	public static void withdrawal(double amt) {
		if(amt!=0 && Bank.bal>=amt){
            Bank.bal-=amt;
            Bank.prevTrans=-amt;
            System.out.println(amt+" Withdrawal successfully");
        }
        else if(Bank.bal<amt){
            System.out.println("Bank balance insufficient");
        }
	}
}
