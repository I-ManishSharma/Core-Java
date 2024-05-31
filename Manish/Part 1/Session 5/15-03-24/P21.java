class P21 {

	public static void printDigits(int a) {
		int temp;
		while (a > 0) {
			temp = a % 10;
			System.out.println(temp);
			a /= 10;
		}
	}

	public static void main(String[] args) {
		printDigits(123);
	}
}