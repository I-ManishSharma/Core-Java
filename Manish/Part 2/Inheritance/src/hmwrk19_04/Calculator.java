package hmwrk19_04;

public class Calculator extends Number {
	
	void add(int a, int b) {
		System.out.println("Sum = " + (a+b));
	}
	
	void sub(int a, int b) {
		System.out.println("Sub = "+ (a-b));
	}
	
	void mul(int a, int b) {
		System.out.println("Mul = "+ (a*b));
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(c.n1,c.n2);
		c.sub(c.n1,c.n2);
		c.mul(c.n1,c.n2);
	}
}
