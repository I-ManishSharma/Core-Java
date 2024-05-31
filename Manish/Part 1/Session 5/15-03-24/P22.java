class P22 {

	public static void sumOfDigits(int a) {
		int temp, sum = 0, b = a;
		while (a > 0) {
			temp = a % 10;
			System.out.println(temp);
			a /= 10;
			sum += temp;

		}
		System.out.println("Sum of digit of " + b + " is " + sum);
	}

	public static void main(String[] args) {
		sumOfDigits(123);
	}
}