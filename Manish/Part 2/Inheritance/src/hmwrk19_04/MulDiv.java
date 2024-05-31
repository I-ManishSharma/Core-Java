package hmwrk19_04;

public class MulDiv extends Data {
	
	void mul(int a, int b) {
		System.out.println("mul = "+ (a*b));
	}
	
	void div(int a, int b) {
		System.out.println("div = "+ (a/b));
	}
	
	public static void main(String[] args) {
		MulDiv m = new MulDiv();
		m.mul(m.n1, m.n2);
		m.div(m.n1, m.n2);
	}

}
