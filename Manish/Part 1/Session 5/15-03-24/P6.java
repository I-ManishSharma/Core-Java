class P6 {

	public static int p6(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}

	public static void main(String[] args) {

		p6(10, 5);
		int a = p6(10, 5);

		System.out.println(p6(10, 5));
	}
}