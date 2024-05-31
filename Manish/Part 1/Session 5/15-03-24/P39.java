class P39 {
	public static void simpleInterest(float amt, float time, float rate) {
		float s_i = amt * time * rate;
		float res = s_i / 100;
		System.out.println("Simple interest is " + res);
	}

	public static void main(String[] args) {
		simpleInterest(8f, 5f, 12f);
	}
}