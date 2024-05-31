package driver;

import java.util.Scanner;

import calculator.Calculator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		do {
		System.out.println("Enter option : ");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Square");
		System.out.println("6. Cube");
		System.out.println("7. Power");
		System.out.println("8. Exit");
		ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.print("Enter the first Number : ");
			int num1=sc.nextInt();
			System.out.print("Enter the Second Number : ");
			int num2=sc.nextInt();
			c.add(num1, num2);
			System.out.println(c.getres());
			break;
		}
		case 2:{
			System.out.print("Enter the first Number : ");
			int num1=sc.nextInt();
			System.out.print("Enter the Second Number : ");
			int num2=sc.nextInt();
			c.sub(num1, num2);
			System.out.println(c.getres());
			break;
		}
		case 3:{
			System.out.print("Enter the first Number : ");
			int num1=sc.nextInt();
			System.out.print("Enter the Second Number : ");
			int num2=sc.nextInt();
			c.mul(num1, num2);
			System.out.println(c.getres());
			break;
		}
		case 4:{
			System.out.print("Enter the first Number : ");
			int num1=sc.nextInt();
			System.out.print("Enter the Second Number : ");
			int num2=sc.nextInt();
			c.div(num1, num2);
			if(num2!=0)
				System.out.println(c.getres());
			break;
		}
		case 5:{
			System.out.print("Enter the Number : ");
			int num1=sc.nextInt();
			c.square(num1);
			System.out.println(c.getres());
			break;
		}
		case 6:{
			System.out.print("Enter the Number : ");
			int num1=sc.nextInt();
			c.cube(num1);
			System.out.println(c.getres());
			break;
		}
		case 7:{
			System.out.print("Enter the Number : ");
			int num1=sc.nextInt();
			System.out.print("Enter the power : ");
			int num2=sc.nextInt();
			c.power(num1, num2);
			System.out.println(c.getres());
			break;
		}
		case 8:{
			System.out.println("Thank you for using the program....");
			System.out.println("For more check Github: I-ManishSharma");
			break;
		}
		default:{
			System.out.println("Wrong Input...");
			System.out.println("Please Try again");
		}
		}
		}while(ch!=8);
		sc.close();
	}
}
