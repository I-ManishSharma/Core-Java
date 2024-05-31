class P15 {
	public static void factors() {
		int sum = 0;
		for (int a = 1; a <= 6; a++) {
			if (6 % a == 0) {
				sum += a;
			}
		}
		System.out.println("Sum of factors of 6 is " + sum);
	}

	public static void main(String[] args) {
		factors();
	}
}