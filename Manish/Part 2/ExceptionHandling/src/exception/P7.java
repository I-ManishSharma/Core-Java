package exception;

class P8 {
	
}

public class P7 extends P8{
	static void createObj(P8 p) {
		P7 pp = (P7)p;
		System.out.println(pp);
	}

	public static void main(String[] args) {
		P8 p = new P8();
		try {
			createObj(p);
		}
		catch(ClassCastException c) {
			System.out.println("p does not contain the referecnece of child type");
		}
	}

}
