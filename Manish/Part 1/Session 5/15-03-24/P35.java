class P35 {
	static void area(int length) {
		int area = length * length;
		int perimeter = 4 * length;
		System.out.println("area of square is " + area);
		System.out.println("permieter of square is " + perimeter);

	}

	public static void main(String[] args) {
		area(6);
	}
}