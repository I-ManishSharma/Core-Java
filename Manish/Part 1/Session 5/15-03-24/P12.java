class P12 {
	public static void sumOfEven() {
		int sum = 0;
		for (int a = 1; a <= 20; a++) {
			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sumOfEven();
	}

}