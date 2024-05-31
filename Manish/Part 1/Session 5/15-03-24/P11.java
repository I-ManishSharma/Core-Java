class P11 {
	public static int product(int a, int b) {
		System.out.println("Product of " + a + " and " + b + " is " + (a * b));
		return a + b;
	}

	public static void main(String[] args) {
		product(1, 1);
		int a = product(1, 2);
		System.out.println(product(1, 3));
	}

}