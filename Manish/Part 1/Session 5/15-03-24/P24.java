class P24 {

	public static void sumOfEven(int a) {
		int temp, sum = 0, b = a;
		while (a > 0) {
			temp = a % 10;
			if (a % 2 == 0) {
				sum += temp;
			}
			a /= 10;
		}
		System.out.println("sum of even digit of a no is " + sum);
	}

	public static void main(String[] args) {
		sumOfEven(123456);
	}
}