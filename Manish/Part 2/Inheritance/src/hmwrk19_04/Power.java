package hmwrk19_04;

public class Power extends Number1 {
	
	void sqr(int num) {
		System.out.println("sqr = "+(num*num));
	}

	void cube(int num) {
		System.out.println("cube = "+ (num*num*num));
		}

	public static void main(String[] args) {
		Power p = new Power();
		p.sqr(p.num);
		p.cube(p.num);
	}

}
