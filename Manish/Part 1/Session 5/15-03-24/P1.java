class P1 {

	public static int p1(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static void main(String[] args) {

		p1(1, 1);
		int a = p1(1, 2);
		System.out.println(p1(2, 3));

	}
}