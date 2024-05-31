package exception;

public class P3 {

	static void printString(String s) throws StringIndexOutOfBoundsException {
		for (int i = 0; i < s.length()+1; i++) {
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		String s = "Manish";
		try {			
			printString(s);
		}
		catch (StringIndexOutOfBoundsException a) {
			System.out.println("Enter index less then: "+ s.length());
		}
	}

}
