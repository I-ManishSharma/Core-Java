package arraylist;

import java.util.ArrayList;

public class ArrayListHomo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(5);
		arr.add(15);
		arr.add(25);
		arr.add(35);
		arr.add(5);
		arr.add(null);
		arr.add(null);	
		
		System.out.println(arr);
		System.out.println("------------------");
		
		for (Integer i : arr) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
