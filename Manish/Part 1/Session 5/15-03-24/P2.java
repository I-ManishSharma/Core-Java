class P2 {

	public static float p2(float a, float b) {
		System.out.println(a + b);
		return a + b;
	}

	public static void main(String[] args) {

		p2(0.9f, 0.1f);
		float a = p2(0.9f, 1.1f);
		System.out.println(p2(1.9f, 1.1f));

	}
}