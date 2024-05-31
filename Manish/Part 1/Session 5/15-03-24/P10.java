class P10 {
	public static int add(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is" + (a + b));
		return a + b;
	}

	public static void main(String[] args) {
		add(1, 1);
		int a = add(1, 2);
		System.out.println(add(1, 3));
	}

}