class P4 {

	public static byte p4(int a, int b) {
		System.out.println(a + b);
		return (byte) (a + b);

	}

	public static void main(String[] args) {

		p4(1, 1);
		byte a = p4(1, 2);
		System.out.println(p4(1, 3));
	}
}