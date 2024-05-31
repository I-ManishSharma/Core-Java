package linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetHomo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		lh.add(25);
		lh.add(05);
		lh.add(65);
		lh.add(85);
		lh.add(05);
		lh.add(96);
		
		System.out.println(lh);
	}
}
