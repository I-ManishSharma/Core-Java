package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StoreName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		Student s = new Student(56,"MAnish","manish@gmail",8923899285l,"Gurgaon");
		Student s1 = new Student(52,"Arvi","arvi@gmail",8899284,"Gurugram");
		arr.add(s);
		arr.add(s1);
		System.out.println("Before");
		for (Student st : arr) {
			System.out.println(st);
		}
		Collections.sort(arr);
		System.out.println("After");
		for (Student st : arr) {
			System.out.println(st);
		}
		
		System.out.println("-----------------------------");
		TreeSet<Student> t = new TreeSet<Student>();
		t.add(s);
		t.add(s1);
		System.out.println(t);
		
		
		sc.close();
	}
}
