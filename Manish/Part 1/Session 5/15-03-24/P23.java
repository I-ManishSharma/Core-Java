class P23 {

	public static void productOfDigits(int a) {
		int temp, product = 1, b = a;
		while (a > 0) {
			temp = a % 10;

			product *= temp;

			a /= 10;
		}
		System.out.println("product of digit of " + b + " is " + product);
	}

	public static void main(String[] args) {
		productOfDigits(123);
	}
}