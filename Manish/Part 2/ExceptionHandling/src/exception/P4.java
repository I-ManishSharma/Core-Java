package exception;

public class P4 {
	
	static void sLength(String s) throws NullPointerException {
		s.length();
	}
	public static void main(String[] args) {
		String s = null;

		try {			
			sLength(s);
		}
		catch (NullPointerException n) {
			System.out.println("String is empty");
		}
	}
}
