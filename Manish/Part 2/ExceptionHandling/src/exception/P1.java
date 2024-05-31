package exception;

import java.util.TreeMap;

public class P1 {
	static void add() throws ArithmeticException {
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		try {
			add();
		}
		catch (ArithmeticException e) {
			System.out.println("Devide by zero");
		}
		
		TreeMap<Object, Object> t = new TreeMap<Object, Object>();
		t.put(1, "Manish");
		t.put(2, "Arvi");
		t.put(3, "Nitin");
		t.put(4, "Manoj");
		t.put(5, "Arvikk");
		t.put(6, "Pulki");
		System.out.println(t.values());
		
	}
}