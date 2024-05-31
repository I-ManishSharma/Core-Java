package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class store {
	public static void main(String[] args) {
		
		Login l = new Login();
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<Object>();
		
		System.out.println("Enter the name: ");
		
		l.setName(sc.next());
		al.add(l.getName());
		
		System.out.println(al);
		
		Object [] arr = al.toArray();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	} 
}
