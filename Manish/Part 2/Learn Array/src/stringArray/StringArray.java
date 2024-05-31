package stringArray;

public class StringArray {
	public static void main(String[] args) {
		
		//Question1: Create an Array
		String [] arr;
		arr = new String[5];
		
		//Question2: Insert element along with duplicate
		arr[0] = "Manish";
		arr[1] = "Arvikk";
		arr[2] = "Nitin";
		arr[3] = "Harsh";
		arr[4] = "Arvikk";
		
		//Question3: Print reference
		System.out.println(arr);
		
		//Question4: Print the no. of element present in array;
		System.out.println(arr.length);
		
		//Question5: Print each and every element of array using index
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//Question6: Access all the elements of array in backward and forward direction along with index using loops.
		System.out.println("For loop (Forward)");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+" "+arr[i]);
		}
		
		System.out.println("For loop (Backward)");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(i+" "+arr[i]);
		}
		
		System.out.println("while loop (Forward)");
		int n = 0;
		while (n < arr.length) {
			System.out.println(n+" "+arr[n]);
			n++;
		}
		
		System.out.println("while loop (Backward)");
		n = arr.length-1;
		while (n >= 0) {
			System.out.println(n+" "+arr[n]);
			n--;
		}
		
		System.out.println("Do while loop (Forward)");
		n = 0;
		do {
			System.out.println(n+" "+arr[n]);
			n++;
		} while (n < arr.length);
		
		System.out.println("Do while loop (Backward)");
		n = arr.length-1;
		do {
			System.out.println(n+" "+arr[n]);
			n--;
		} while (n >= 0);
	}
}
