package inheritance;

public class MultipleInheritance implements L1,L2{
	public void m1() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.m1();
	}
}
