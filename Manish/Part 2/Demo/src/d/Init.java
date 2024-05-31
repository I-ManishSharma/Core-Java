package d;

import java.util.ArrayList;
import java.util.HashSet;

public class Init {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(5);
		al.add(6);
		al.add("Manish");
		al.add('c');
		al.add(5.5);
		
		System.out.println(al);
		
		ArrayList<Object> arr = new ArrayList<Object>();
		
		arr.add(5);
		arr.add(false);
		arr.add(al);
		arr.add(true);
		arr.add(95);
		arr.addAll(al);
		arr.add(0,15);
		
		System.out.println(arr);
		
		for (Object o : arr) {
			System.out.println(o);
		}
		
		ArrayList<Object> arr1 = new ArrayList<Object>();
		
		
		HashSet<Object> ob = new HashSet<Object>();
	}
}
