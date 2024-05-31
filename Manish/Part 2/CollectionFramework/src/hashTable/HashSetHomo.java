package hashTable;

import java.util.HashSet;

public class HashSetHomo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(56);
		hs.add(98);
		hs.add(02);
		hs.add(85);
		hs.add(45);
		hs.add(02);
		
		System.out.println(hs);
		System.out.println("-------------------");
		
		for (Integer i : hs) {
			System.out.println(i);
		}
	}
}
