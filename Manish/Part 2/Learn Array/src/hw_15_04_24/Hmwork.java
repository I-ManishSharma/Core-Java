package hw_15_04_24;

public class Hmwork {
	public static void main(String[] args) {
		int roll [] = new int[7];
		String name [] = new String[10];
		int empId [] = new int[4];
		double [] salary = new double[5];
		char [] group = new char[8];
		boolean [] opinion = new boolean[7];
		long [] phno = {8923809828l,7351403439l,8436547566l};
		
		//Question1:
		System.out.println(roll);
		System.out.println(name);
		System.out.println(empId);
		System.out.println(salary);
		System.out.println(group);
		System.out.println(opinion);
		System.out.println(phno);
		
		//Question2:
		System.out.println(roll.length);
		System.out.println(name.length);
		System.out.println(empId.length);
		System.out.println(salary.length);
		System.out.println(group.length);
		System.out.println(opinion.length);
		System.out.println(phno.length);
		
		//Question3:
		//1
		roll[0] = 1;
		roll[1] = 2;
		roll[2] = 3;
		roll[3] = 4;
		roll[4] = 5;
		roll[5] = 6;
		roll[6] = 7;
		
		//2
		name[0] = "Manish";
		name[1] = "Arvikk";
		name[2] = "Harsh";
		name[3] = "Nitin";
		name[4] = "Manoj";
		name[5] = "Monji";
		name[6] = "Pulkit";
		name[7] = "Pulki";
		name[8] = "Pulma";
		name[9] = "Yukti";
		
		//3
		empId[0] = 01;
		empId[1] = 02;
		empId[2] = 03;
		empId[3] = 04;
		
		//4
		salary[0] = 100000.00;
		salary[1] = 25023.54;
		salary[2] = 25364.55;
		salary[3] = 85685.55;
		salary[4] = 25236.55;
		
		//5
		group[0] = 'a';
		group[1] = 'b';
		group[2] = 'c';
		group[3] = 'd';
		group[4] = 'e';
		group[5] = 'f';
		group[6] = 'g';
		group[7] = 'h';
		
		//6
		opinion[0] = true;
		opinion[1] = false;
		opinion[2] = true;
		opinion[3] = false;
		opinion[4] = true;
		opinion[5] = false;
		opinion[6] = true;
		
		//Question4:
		//1
		for (int i : roll) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//2
		for (String i : name) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//3
		for (int i : empId) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//4
		for (double i : salary) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//5
		for (char i : group) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//6
		for (boolean i : opinion) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//7
		for (long i : phno) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Question5:
		//1
		for (int i : roll) {
			if (i % 2 == 0) System.out.print(i+" ");
		}
		System.out.println();
		
		//3
		for (int i : empId) {
			if (i % 2 == 0) System.out.print(i+" ");
		}
		System.out.println();

		//Question6:
		//1
		int count = 0;
		for (int i : roll) {
			if (i % 2 != 0) count++;
		}
		System.out.println(count);
		
		//3
		count = 0;
		for (int i : empId) {
			if (i % 2 != 0) count++;
		}
		System.out.println(count);
		
		//Question7:
		int [] first_array = {1,2,3,4,5,6,7};
		int [] second_array = new int[first_array.length];
		int j = 0;
		for (int i = first_array.length-1; i >= 0 ; i--) {
			second_array[j++] = first_array[i];
		}
		
		for (int i : second_array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Question8:
		int [] arr = {1,2,3,4,5,6,7};
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) System.out.print(arr[i]);
		}
	}
}
