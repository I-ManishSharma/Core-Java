class P17 {
	public static void factorial() {
		int factorial = 1;

		for (int a = 10; a >= 1; a--) {
			factorial *= a;
		}

		System.out.println("factorial of 10 is " + factorial);

	}

	public static void main(String[] args) {
		factorial();
	}
}