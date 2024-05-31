class P19 {

	public static void sumOfFactors() {
		int sum = 0;
		for (int a = 1; a <= 9; a++) {
			if (9 % a == 0) {
				sum += a;
			}
		}
		System.out.println("Sum of factors of 9  is " + sum);
	}

	public static void main(String[] args) {
		sumOfFactors();
	}
}