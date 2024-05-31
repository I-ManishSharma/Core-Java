package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetHetro {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(56);
		hs.add("Manish");
		hs.add("Sharma");
		hs.add(null);
		hs.add(44.59);
		
		System.out.println(hs);
		
		
		HashMap<Object, Integer> h = new HashMap<Object, Integer>();
		
		h.put(1, 1);
		h.put("Manish", 2);
		h.put('c', 9);
		h.put('p', 5);
		
		System.out.println(h);
	}
}
