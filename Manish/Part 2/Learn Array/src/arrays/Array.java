package arrays;

class Student {
}

public class Array {
	public static void main(String[] args) {
		//byte
		byte [] arr = {1,2,3,4,5,6};
		for (byte i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//short
		short [] arr1 = {23,25,26,24,88};
		for (short i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//int
		int [] arr2 = {235,265,243,258,953};
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//long
		long [] arr3 = {235894356,4546897256l,3569867125l,6598743254l}; 
		for (long i : arr3) {
			System.out.print(i+" ");
		}
		System.out.println();
			
		//float
		float [] arr4 = {23.2f,2356.5f,5254.5f,6535.5f};
		for (float i : arr4) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//double
		double [] arr5 = {235.56,65398.56,64635.56,89765.256};
		for (double i : arr5) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//char
		char [] arr6 = {'m','a','n','i','s','h'};
		for (char i : arr6) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//String
		String [] arr7 = {"Manish","Arvikk","Pulkit","Manoj"};
		for (String i : arr7) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Boolean
		boolean [] arr8 = {true,false,false,true,true};
		for (boolean i : arr8) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student [] arr9 = {s1,s2,s3,s4,s5};
		for (Student i : arr9) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//default values
		System.out.print("Default value in byte array: ");
		byte [] a1 = new byte [5];
		for (byte i : a1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in short array: ");
		short [] a2 = new short [5];
		for (short i : a2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in int array: ");
		int [] a3 = new int [5];
		for (int i : a3) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in long array: ");
		long [] a4 = new long [5];
		for (long i : a4) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in float array: ");
		float [] a5 = new float [5];
		for (float i : a5) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in double array: ");
		double [] a6 = new double [5];
		for (double i : a6) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in char array: ");
		char [] a7 = new char [5];
		for (char i : a7) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in String array: ");
		String [] a8 = new String [5];
		for (String i : a8) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in boolean array: ");
		boolean [] a9 = new boolean [5];
		for (boolean i : a9) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Default value in Student array: ");
		Student [] a10 = new Student [5];
		for (Student i : a10) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		char ch = (char) 1;
		System.out.println(ch);
	}
}