class P1 {
	public static void main (String [] args) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print((j%2 == 0) ? "#" : "*");
			}
			System.out.println();
		}
	}
}