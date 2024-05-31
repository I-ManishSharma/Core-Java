package hmwrk19_04;

public class Calculator1 extends Customer{
	
	void si(int p, int t, int r) {
		System.out.println("Simple intrest = " + ((p*t*r)/100));
	}

	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		c.si(c.p,c.t,c.r);
	}

}
