class P37 {
	static int factorial(int a) {
		int factorial = 1;
		for (; a >= 1; a--) {
			factorial *= a;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(factorial(7));
	}
}