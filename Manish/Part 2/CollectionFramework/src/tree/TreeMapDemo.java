package tree;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Object, Object> tm = new TreeMap<Object, Object>();
		tm.put(56, 'M');
		tm.put(52, 88);
		tm.put("Manish", 89);
		tm.put(59,"Arvikk");
		
		Set<Object> s = tm.keySet();
		System.out.println(s);
		System.out.println(tm.values());
	}
}
