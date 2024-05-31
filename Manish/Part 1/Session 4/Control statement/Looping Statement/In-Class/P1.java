class P1 {
	public static void main (String [] args) {
		int num1 = 4, num2 = 9, num3 = 6;
		System.out.println(((num1 > num2) && (num1 > num3)) ? num1 : ((num2 > num1) && (num2 > num3)) ? num2 : num3); 
	}
}