class P29 {
	public static void power(int a, int b) {
		int o = a;

		for (int p = 1; p < b; p++) {
			a *= o;
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		power(5, 4);
	}
}