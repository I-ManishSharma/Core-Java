class P14 {
	public static void sumOfPrime() {

		int sum = 0;

		for (int a = 2; a <= 20; a++) {
			boolean p = true;

			for (int b = 2; b < a; b++) {
				if (a % b == 0) {
					p = false;
					break;
				}
			}
			if (p) {
				sum += a;
			}
		}
		System.out.println("sum of Prime no of between 1 to 20 is " + sum);
	}

	public static void main(String[] args) {
		sumOfPrime();
	}

}