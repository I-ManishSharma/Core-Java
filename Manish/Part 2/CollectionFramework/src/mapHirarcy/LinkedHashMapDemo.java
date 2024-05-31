package mapHirarcy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Object, Object> h = new LinkedHashMap<Object, Object>();
		h.put(1, 98);
		h.put("MAnish", 65);
		h.put("Arvikk", "Sharma");
		h.put("Sharma", 98);
		System.out.println(h);
		
		Set<Object> s = h.keySet();
		System.out.println(h.values());
		System.out.println(s);
		System.out.println(h.containsKey("MAnish"));
		System.out.println(h.containsValue("Sharma"));
		System.out.println(h.containsKey(38));
		System.out.println(h.get(1));
		System.out.println(h.size());
		
		h.remove(1);
		Set<Object> s1 = h.keySet();
		System.out.println(s1);
		h.clear();
		System.out.println(h.size());
	}
}
