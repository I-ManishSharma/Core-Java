package hmwrk19_04;

public class SumSub extends Data{
	
	void sum(int a, int b) {
		System.out.println("Sum = "+ (a+b));
	}
	
	void sub(int a, int b) {
		System.out.println("Sub = "+ (a-b));
	}
	
	public static void main(String[] args) {
		SumSub s = new SumSub();
		s.sum(s.n1,s.n2);
		s.sub(s.n1,s.n2);
	}
}
