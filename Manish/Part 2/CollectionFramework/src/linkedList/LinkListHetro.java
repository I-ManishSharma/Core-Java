package linkedList;

import java.util.LinkedList;

public class LinkListHetro {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("ManisH");
		li.add("Sharma");
		li.add(56.55);
		li.add(568);
		li.add(null);
		li.add(22);
		li.add(null);
		
		System.out.println(li);
	}
}
