class P8 {

	public static int p8(int a, int b) {
		System.out.println(a % b);
		return a % b;
	}

	public static void main(String[] args) {

		p8(15, 2);
		int a = p8(15, 2);

		System.out.println(p8(15, 2));
	}
}