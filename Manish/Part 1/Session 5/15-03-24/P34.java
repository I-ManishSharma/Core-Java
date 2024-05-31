class P34 {
	static float perimeter(float length, float width) {
		float perimeter = 2 * (length + width);
		return perimeter;
	}

	public static void main(String[] args) {
		System.out.println("Perimemter of rectangle is " + perimeter(4.1f, 3.2f));
	}
}