package exception;

public class P6 {
	static void parse(String s) throws NumberFormatException {
		int i = Integer.parseInt(s);
		System.out.println(i);
	}
	public static void main(String[] args) {
		String s = "arvi";
		try {			
			parse(s);
		}
		catch (NumberFormatException n) {
			System.out.println("String does not contain number");
		}
	}
}
