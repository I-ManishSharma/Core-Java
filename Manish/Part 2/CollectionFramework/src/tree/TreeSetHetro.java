package tree;

import java.util.TreeSet;

public class TreeSetHetro {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("Manish");
		t.add("Sharma");
		t.add(56);
		t.add(null);
		
		System.out.println(t);
	}
}
