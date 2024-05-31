class P16 {
	public static void factors() {
		int product = 1;
		for (int a = 1; a <= 6; a++) {
			if (6 % a == 0) {
				product *= a;
			}
		}
		System.out.println("product of factors of 6 is " + product);
	}

	public static void main(String[] args) {
		factors();
	}
}