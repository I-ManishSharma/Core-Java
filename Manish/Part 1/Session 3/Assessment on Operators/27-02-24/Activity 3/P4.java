//Print Simple Intrest

class P4 {
	public static void main (String[] args) {
		double principal = 800000;
		int timeMonths = 60;
		double rateOfInterest = 12.0;
		double simpleInterest = (principal * rateOfInterest * timeMonths) / (12 * 100);
		System.out.println("Simple Intrest = " + simpleInterest);
	}
}