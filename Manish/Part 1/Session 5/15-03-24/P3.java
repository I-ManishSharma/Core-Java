class P3 {

	public static float p3(int a, float b, float c) {
		System.out.println(a + b + c);
		return a + b + c;
	}

	public static void main(String[] args) {

		p3(1, 0.9f, 0.1f);
		float a = p3(1, 0.9f, 1.1f);
		System.out.println(p3(1, 0.9f, 2.1f));

	}
}