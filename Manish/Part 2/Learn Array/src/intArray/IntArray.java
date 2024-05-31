package intArray;

import java.util.Scanner;

public class IntArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Array declaration: there are three ways to declare an array
		//1.
		int [] arr;				//OR int arr [];
		arr = new int[5];
		
		//2.
		int [] arr1 = new int[5];		//OR int arr1 [] = new int []

		//initialization:
		//Using index: arrayName[index] = value;
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 4;
		arr[3] = 3;
		arr[4] = 7;
		
		//using loop: For loop
		
		System.out.println("Enter the elements of array (up to index 5)");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//3. Declaration with initialization
		int [] arr2 = {2,3,4,5,6,7,8,9,10}; //OR int arr [] = {1,2,3};
		
		//Accessing element of array
		//1. we can access using index
		
		System.out.println("Directly Using index");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//Using loops for, while, do while or for each
		
		//for loop
		System.out.println("Using for loop");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		//for each
		System.out.println("Using for each loop");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
