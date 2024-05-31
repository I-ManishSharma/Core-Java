class P13 {
	public static void sumOfOdd() {
		int sum = 0;
		for (int a = 1; a <= 20; a++) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println("sum of odd no of between 1 to 20 is " + sum);
	}

	public static void main(String[] args) {
		sumOfOdd();
	}

}