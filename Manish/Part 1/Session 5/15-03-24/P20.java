class P20 {

	public static void productOfFactors() {
		int product = 1;
		for (int a = 1; a <= 12; a++) {
			if (12 % a == 0) {
				product *= a;
			}
		}
		System.out.println("product of factors of 9  is " + product);
	}

	public static void main(String[] args) {
		productOfFactors();
	}
}