package arraylist;

import java.util.ArrayList;

public class ArrayListHetro {
	public static void main(String[] args) {
		
		ArrayList arrlist = new ArrayList();
		arrlist.add("Manish");
		arrlist.add("Sharma");
		arrlist.add(5);
		arrlist.add(5.5);
		arrlist.add('c');
		arrlist.add(5);
		
		for (Object k: arrlist) {
			System.out.println(k);
		}
		
		
	}
}
