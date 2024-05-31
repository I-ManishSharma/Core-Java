package d;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the roll number: ");
		byte roll = sc.nextByte();
		
		System.out.print("Enter the Enrollment number: ");
		int enrol = sc.nextInt();
		
		System.out.print("Enter the class room number: ");
		short class_room = sc.nextShort();
		
		sc.nextLine();
		
		System.out.print("Emter the name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Phone number: ");
		long phone = sc.nextLong();
		
		System.out.print("Enter the Grade: ");
		char grade = sc.next().charAt(0);
		
		System.out.print("Enter the cgpa: ");
		float cgpa = sc.nextFloat();
		
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		
		System.out.print("Enter ture or false according to pass or fail: ");
		boolean pass = sc.nextBoolean();
		
		System.out.println("Roll number " + roll);
		System.out.println("Enrollment number " + enrol);
		System.out.println("Class Room number " + class_room);
		System.out.println("Name " + name);
		System.out.println("Phone number " + phone);
		System.out.println("Grade " + grade);
		System.out.println("CGPA " + cgpa);
		System.out.println("Percentage " + percentage);
		System.out.println("Pass " + pass);
		sc.close();
	}
}
