class P7 {

	public static int p7(int a, int b) {
		System.out.println(a % b);
		return a % b;
	}

	public static void main(String[] args) {

		p7(10, 5);
		int a = p7(10, 5);

		System.out.println(p7(10, 5));
	}
}