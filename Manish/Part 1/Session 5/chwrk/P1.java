public class P1 {

	public static int add (int x, int y) {
		return x+y;
	}
	public static int product (int x, int y) {
		return x*y;
	}
	public static void add2 () {
		int a = 5, b = 7;
		int add = add(a,b);
		int product = product(a,b);
		System.out.println(add+product);
	}
	public static void main (String [] args) {
		add2();
	}
}