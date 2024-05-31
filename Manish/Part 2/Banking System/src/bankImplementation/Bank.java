package bankImplementation;

import java.util.Scanner;

import deposit.Deposit;
import login.Login;
import previousTransaction.PrevTrans;
import withdrawal.Withdrawal;

public class Bank {
	public static double bal;
    public static double prevTrans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder user = new StringBuilder();
		StringBuilder account = new StringBuilder();
		System.out.println("Welcome to Jan Kalyan Bank");
		System.out.println("---------------------------------------");
		
		long account_number = 2345678910l;
		
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 for login");
			System.out.println("Enter 2 to create a Account");
			System.out.println("Enter 3 to exit");
			System.out.println("---------------------------------------");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("---------------------------------------");
				System.out.print("Enter the customer name: ");
				sc.nextLine();
				String cus_name = sc.nextLine();
				System.out.print("Enter the customer Account number: ");
				String acc_number = sc.nextLine();
				
				if (Login.login(user, account, cus_name,acc_number)) {
					
					System.out.println("---------------------------------------");
					System.out.println("login Successfull");
					System.out.println("---------------------------------------");
					boolean flg = true;
					while (flg) {
						System.out.println("Enter 1 to check balance");
						System.out.println("Enter 2 to deposit money");
						System.out.println("Enter 3 to withdrawal money");
						System.out.println("Enter 4 to check previous transaction");
						System.out.println("Enter 5 to logout");
						System.out.println("---------------------------------------");
						System.out.print("Enter your choice: ");
						
						int choice1 = sc.nextInt();
						
						switch (choice1) {
						case 1:
							System.out.println("---------------------------------------");
							System.out.println("Your Account Balance is: "+ bal);
							System.out.println("---------------------------------------");
							break;
						case 2:
							System.out.println("---------------------------------------");
							System.out.print("Enter the amount to be deposit: ");
							double amount = sc.nextInt();
							Deposit.deposit(amount);
							System.out.println("---------------------------------------");
							break;
						case 3:
							System.out.println("---------------------------------------");
							System.out.print("Enter the amount to be withdrawal: ");
							int amt = sc.nextInt();
							Withdrawal.withdrawal(amt);
							System.out.println("---------------------------------------");
							break;
						case 4:
							System.out.println("---------------------------------------");
							PrevTrans.getPreviousTrans();
							System.out.println("---------------------------------------");
							break;
						case 5:
							flg = false;
							System.out.println("---------------------------------------");
							System.out.println("Logout Successfully");
							break;
						default:
							System.out.println("---------------------------------------");
							System.out.println("Invalid choice");
							System.out.println("---------------------------------------");
						}
					}
					
				}
				
				System.out.println("-----------------------------------");
				break;
			case 2:
				System.out.println("-----------------------------------");
				System.out.print("Enter your name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				account.append(++account_number);
				System.out.println("Account created Successfully.");
				System.out.println("Name of costumer: "+name);
				System.out.println("Account Number: "+account_number);
				System.out.println("----------------------------------------");
				break;
			case 3:
				flag = false;
				System.out.println("-------------------------------------------------------");
				System.out.println("Thankyou for using our bank services. ");
				System.out.println("-------------------------------------------------------");
				break;
			default:
				System.out.println("---------------------------------------");
				System.out.println("Invalid choice");
				System.out.println("---------------------------------------");
			}
		}
		System.out.println("For more projects check github: I-ManishSharma");
		sc.close();
	}
}