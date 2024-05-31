package assignment05_04_24;

public class Student {
	public Student(int a, long l, float f, double d, char c, String s) {
		System.out.println(a+" "+l+" "+f+" "+d+" "+c+" "+s);
	}
	public static void main(String[] args) {
		Student s = new Student(69,8923809828l,98.5f,98.2,'A',"Manish Sharma");
	}
}
