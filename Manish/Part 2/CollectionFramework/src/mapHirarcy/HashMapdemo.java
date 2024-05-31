package mapHirarcy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashMapdemo {
	public static void main(String[] args) {
		HashMap<Object, Object> h = new HashMap<Object, Object>();
		h.put(1, 98);
		h.put("MAnish", 65);
		h.put("Arvikk", "Sharma");
		h.put("Sharma", 98);
		System.out.println(h);
		
		System.out.println("------------------------------");
		
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(56, 85);
		ht.put(85,99);
		ht.put(86, 95);
		
		Set<Integer> s = ht.keySet();
		
		System.out.println(s);
		System.out.println(ht.values());
		ht.remove(56);
		System.out.println(s);
		
		System.out.println("------------------------------");
		
		Hashtable<Object, Object> ht1 = new Hashtable<Object, Object>();
		ht1.put(56, "MANish");
		ht1.put("Sharma",56);
		ht1.put(86, "Arvikk");
		ht1.put('a', 58);
		
		Set<Object> s1 = ht1.keySet();
		System.out.println(s1);
		System.out.println(ht.values());
		ht.remove(56);
		System.out.println(s);
	}
}
