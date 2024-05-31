class P5 {

	public static short p5(int a, int b) {
		System.out.println(a + b);
		return (short) (a + b);

	}

	public static void main(String[] args) {

		p5(1, 1);
		short a = p5(1, 2);
		System.out.println(p5(1, 3));
	}
}